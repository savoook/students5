package database;

import entity.Account;
import entity.Discipline;
import entity.Student;
import entity.Term;
import org.w3c.dom.ls.LSOutput;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBManager {

    public static List<Discipline> getAllActivDisciplines() {
        ArrayList<Discipline> disciplines = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/students_control?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "estonia");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select*from discipline where status='1'");
            while (rs.next()) {
                Discipline discipline = new Discipline();
                discipline.setId(rs.getInt("id"));
                discipline.setDiscipline(rs.getString("discipline"));
                disciplines.add(discipline);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return disciplines;
    }

    public static Discipline getDisciplinById(String id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/students_control?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "estonia");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select*from discipline where status='1' and id=" + id);
            while (rs.next()) {
                Discipline discipline = new Discipline();
                discipline.setId(rs.getInt("id"));
                discipline.setDiscipline(rs.getString("discipline"));
                return discipline;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void addDiscipline(String newDisc) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/students_control?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "estonia");
            Statement stmt = con.createStatement();
            stmt.execute("insert into `discipline` (`discipline`) values ('" + newDisc + "')");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void modifyDiscipline(String newName, String idDisc) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/students_control?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "estonia");
            Statement stmt = con.createStatement();
            stmt.execute("update `students_control`.`discipline` SET `discipline` = '" + newName + "' WHERE (`id` = '" + idDisc + "');\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void deleteDiscipline(String id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/students_control?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "estonia");
            Statement stmt = con.createStatement();
            stmt.execute("UPDATE `students_control`.`discipline` SET `status` = '0' WHERE (`id` = '" + id + "');");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //    public static List<Term> getAllActivTerns() {
//        ArrayList<Term> terms = new ArrayList<>();
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/students_control?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "estonia");
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("select*from tern where status='1'");
//            while (rs.next()) {
//                Term term = new Term();
//                term.setId(rs.getInt("id"));
//                term.setTern(rs.getString("tern"));
//                term.setDuration(rs.getString("duration"));
//                terms.add(term);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return terms;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(getAllActivDisciplines());
//    }
//
    public static List<Student> getAllActiveStudents() {
        ArrayList<Student> students = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/students_control?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "estonia");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select*from student where status='1'");
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setSurname(rs.getString("surname"));
                student.setGroup(rs.getString("group"));
                student.setDate(rs.getString("data"));
                student.setStatus(rs.getInt("status"));
                students.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    //
//    public static void addDiscipline(String newDisc) {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/students_control?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "estonia");
//            Statement stmt = con.createStatement();
//            stmt.execute("insert into `discipline` (`discipline`) values ('" + newDisc + "')");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
    public static void createStudents(String newSurname, String newName, String newGroup, String newDate) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/students_control?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "estonia");
            Statement stmt = con.createStatement();
            stmt.execute("INSERT INTO `students_control`.`student`` (`surname`, `name`, `group`, `date`) VALUES ('" + newSurname + "', '" + newName + "', '" + newGroup + "', '" + newDate + "')\n;");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Account getAccount(String login, String password, String role) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/students_control?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "estonia");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students_control.accaunt where login='" + login + "' and password='" + password + "' and role='" + role + "';");
            while (rs.next()) {
                Account account = new Account();
                account.setId(rs.getInt("id"));
                account.setLogin(rs.getString("login"));
                account.setPassword(rs.getString("password"));
                account.setRole(rs.getString("role"));
                return account;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    //
//    public static List<Student> getAllActiveStudents() {
//        ArrayList<Student> students = new ArrayList<>();
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection(
//                    "jdbc:mysql://localhost/students_control?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "estonia");
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("select * from student where status = 1");
//            while (rs.next()) {
//                Student student = new Student();
//                student.setId(rs.getInt("id"));
//                student.setSurname(rs.getString("surname"));
//                student.setName(rs.getString("name"));
//                student.setGroup(rs.getString("group"));
//                student.setDate(rs.getString("date"));
//                students.add(student);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return students;
//    }
//    public static List<Term> getAllActiveSemestrs() {
//        ArrayList<Term> semestrs = new ArrayList<>();
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection(
//                    "jdbc:mysql://localhost/students_control?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "estonia");
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("select * from semestr where status = 1");
//            while (rs.next()) {
//                Term semestr = new Term();
//                semestr.setId(rs.getInt("id"));
//                semestr.setTern(rs.getString("semestr"));
//                semestr.setDuration(rs.getString("duration"));
//
//                semestrs.add(semestr);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return semestrs;
//    }
//
//
//    public static List<Discipline> getDisciplinesInSemestr(String idSem) {
//        ArrayList<Discipline> disciplinesInSemestr = new ArrayList<>();
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection(
//                    "jdbc:mysql://localhost/students?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "vitaly");
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("select * from semestr_discipline where id_semestr = " + idSem);
//
//            while (rs.next()) {
//                Discipline discipline = new Discipline();
//                int idDisc = rs.getInt("id_discipline");
//                discipline.setId(idDisc);
//                discipline.setDiscipline(rs.getString("discipline"));
//                disciplinesInSemestr.add(discipline);
//
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return disciplinesInSemestr;
//    }
}