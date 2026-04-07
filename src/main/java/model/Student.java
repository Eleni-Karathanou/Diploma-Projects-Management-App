package model;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "year_of_studies")
    private int yearOfStudies;

    @Column(name = "current_avg_grade")
    private int currentAvgGrade;

    @Column(name = "remaining_courses")
    private int remainingCourses;

    public Student() {
    }

    public Student(String fullName, int yearOfStudies, int currentAvgGrade, int remainingCourses) {
        this.fullName = fullName;
        this.yearOfStudies = yearOfStudies;
        this.currentAvgGrade = currentAvgGrade;
        this.remainingCourses = remainingCourses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfStudies() {
        return yearOfStudies;
    }

    public void setYearOfStudies(int yearOfStudies) {
        this.yearOfStudies = yearOfStudies;
    }

    public int getCurrentAvgGrade() {
        return currentAvgGrade;
    }

    public void setCurrentAvgGrade(int currentAvgGrade) {
        this.currentAvgGrade = currentAvgGrade;
    }

    public int getRemainingCourses() {
        return remainingCourses;
    }

    public void setRemainingCourses(int remainingCourses) {
        this.remainingCourses = remainingCourses;
    }
}