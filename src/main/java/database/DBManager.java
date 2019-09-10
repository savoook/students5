package database;

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

    public static List<Term> getAllActivTerns() {
        ArrayList<Term> terms = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/students_control?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "estonia");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select*from tern where status='1'");
            while (rs.next()) {
                Term term = new Term();
                term.setId(rs.getInt("id"));
                term.setTern(rs.getString("tern"));
                term.setDuration(rs.getString("duration"));
                terms.add(term);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return terms;
    }

    public static void main(String[] args) {
        System.out.println(getAllActivDisciplines());
    }

//    public static List<Student> getAllActivStudents() {
//        ArrayList<Student> students = new ArrayList<>();
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/students_control?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "estonia");
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("select*from student where status='1'");
//            while (rs.next()) {
//                Student student = new Student();
////                student.setId(rs.getInt("id"));
////                student.setTern(rs.getString("tern"));
////                student.setDuration(rs.getString("duration"));
//                students.add(student);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return students;
//    }

    public static void addDiscipline(String newDisc) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/students_control?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "estonia");
            Statement stmt = con.createStatement();
            stmt.execute("insert into `discipline` (`discipline`) values ('"+newDisc+"')");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}