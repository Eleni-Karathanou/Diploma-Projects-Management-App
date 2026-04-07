package model;

import javax.persistence.*;

@Entity
@Table(name = "applications")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Many applications can belong to one student
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    // Many applications can be for one subject
    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    // Default constructor required by JPA
    public Application() {
    }

    public Application(Student student, Subject subject) {
        this.student = student;
        this.subject = subject;
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

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}