package service;

import java.util.List;
import model.Subject;

public interface SubjectService {
    void save(Subject sub);
    List<Subject> findAll();
    Subject findById(int id);
}