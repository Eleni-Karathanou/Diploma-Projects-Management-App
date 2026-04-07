package service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.StudentDAO;
import dao.SubjectDAO;
import model.Student;
import model.Subject;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    @Autowired
    private SubjectDAO subjectDAO;

    public StudentServiceImpl() {
    }

    @Override
    public void saveProfile(Student student) {
        studentDAO.save(student);
    }

    @Override
    public Student retrieveProfile(String str) {
        return studentDAO.findAll().stream()
                .filter(s -> s.getFullName().equals(str))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Subject> listStudentSubjects() {
        return subjectDAO.findAll();
    }

    @Override
    public void applyToSubject(String str, Integer inter) {
    }
}