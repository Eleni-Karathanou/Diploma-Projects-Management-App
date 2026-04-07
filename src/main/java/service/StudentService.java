package service;

import java.util.List;
import model.Student;
import model.Subject;

public interface StudentService {
    void saveProfile(Student student);
    Student retrieveProfile(String str);
    List<Subject> listStudentSubjects();
    void applyToSubject(String str, Integer inter);
}