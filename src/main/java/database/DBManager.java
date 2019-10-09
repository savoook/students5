package database;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import entity.*;
import org.w3c.dom.ls.LSOutput;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBManager {

    public static Student getStudentById(String id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/students_control?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "estonia");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select*from student where status='1' and id=" + id);
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setSurname(rs.getString("surname"));
                student.setGroup(rs.getString("group"));
                student.setData(rs.getDate("data"));
                return student;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

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
                student.setData(rs.getDate("data"));
                student.setStatus(rs.getInt("status"));
                students.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void createStudents(String newSurname, MysqlxDatatypes.Scalar.String newName, MysqlxDatatypes.Scalar.String newGroup, MysqlxDatatypes.Scalar.String newDate) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
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
            Class.forName("com.mysql.cj.jdbc.Driver");
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


    public static List<Term> getAllActiveTerms() {
        ArrayList<Term> terms = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/students_control?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "estonia");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from term where status = 1");
            while (rs.next()) {
                Term term = new Term();
                term.setId(rs.getInt("id"));
                term.setTerm(rs.getString("term"));
                term.setDuration(rs.getString("duration"));
                terms.add(term);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return terms;
    }


    public static List<Discipline> getDisciplinesInTerm(String idTerm) {
        ArrayList<Discipline> disciplinesInTerm = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/students_control?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "estonia");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT d. id, d.discipline, td.id_term, td.id_discipline FROM students_control.term_discipline as td left join discipline as d on td.id_discipline =d.id where td.id_term='" + idTerm + "'");
            while (rs.next()) {
                Discipline discipline = new Discipline();
                int idDisc = rs.getInt("id_discipline");
                discipline.setId(idDisc);
                discipline.setDiscipline(rs.getString("discipline"));
                disciplinesInTerm.add(discipline);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return disciplinesInTerm;
    }

    public static void modifyStudent(String newSurname, String newName, String newGroup, String newData, String idSt) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/students_control?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "estonia");
            Statement stmt = con.createStatement();
            stmt.execute("UPDATE `students_control`.`student` SET `surname` = '" + newSurname + "', `name` = '" + newName + "', `group` = '" + newGroup + "', `data` = '" + newData + "' WHERE (`id` = '" + idSt + "');\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteStudents(String id) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/students_control?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "estonia");
            Statement stmt = con.createStatement();
            stmt.execute("UPDATE `students_control`.`student` SET `status` = '0' WHERE (`id` = '" + id + "');");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Marks> getMarksByStudentTern(String idSt, int id) {
        ArrayList<Marks> marks = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/students_control?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "estonia");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students_control.mark\n" +
                    "  left join term_discipline as t_d on mark.id_tern_discipline =t_d.id\n" +
                    "  left join discipline as d on t_d.id_discipline=d.id\n" +
                    "  left join term as t on t_d.id_term=t.id\n" +
                    "  where id_student='" + idSt + "' and t_d.id_term='" + id + "' \n" +
                    "  and d.status=1 and t.status=1;");
            while (rs.next()) {
                Marks mark = new Marks();
                Discipline discipline = new Discipline();
                discipline.setId(rs.getInt("id_discipline"));
                discipline.setDiscipline(rs.getString("discipline"));
                discipline.setStatus(1);
                mark.setDiscipline(discipline);
                mark.setMark(rs.getString("mark"));
                marks.add(mark);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return marks;
    }
}
