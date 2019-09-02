package entity;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tern {
    private int id;
    private String tern;
    private String duration;
    private int status = 1;
    private List<Discipline> disciplines = new ArrayList<>();

    public Tern() {
    }

    public Tern(int id, String tern, String duration, int status, List<Discipline> disciplines) {
        this.id = id;
        this.tern = tern;
        this.duration = duration;
        this.status = status;
        this.disciplines = disciplines;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTern() {
        return tern;
    }

    public void setTern(String tern) {
        this.tern = tern;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tern tern1 = (Tern) o;
        return id == tern1.id &&
                status == tern1.status &&
                Objects.equals(tern, tern1.tern) &&
                Objects.equals(duration, tern1.duration) &&
                Objects.equals(disciplines, tern1.disciplines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tern, duration, status, disciplines);
    }

    @Override
    public String toString() {
        return "Tern{" +
                "id=" + id +
                ", tern='" + tern + '\'' +
                ", duration='" + duration + '\'' +
                ", status=" + status +
                ", disciplines=" + disciplines +
                '}';
    }
}
