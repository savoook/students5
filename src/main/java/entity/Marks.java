package entity;

import java.util.Objects;

public class Marks {
    private int id;
    private Student student;
    private Discipline discipline;
    private Term term;
    private String mark;

    public Marks() {
    }

    public Marks(int id, Student student, Discipline discipline, Term term, String mark) {
        this.id = id;
        this.student = student;
        this.discipline = discipline;
        this.term = term;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term term) {
        this.term = term;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marks marks = (Marks) o;
        return id == marks.id &&
                Objects.equals(student, marks.student) &&
                Objects.equals(discipline, marks.discipline) &&
                Objects.equals(term, marks.term) &&
                Objects.equals(mark, marks.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, student, discipline, term, mark);
    }

    @Override
    public String toString() {
        return "Marks{" +
                "id=" + id +
                ", student=" + student +
                ", discipline=" + discipline +
                ", term=" + term +
                ", mark='" + mark + '\'' +
                '}';
    }
}
