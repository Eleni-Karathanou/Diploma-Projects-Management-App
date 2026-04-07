package service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.SubjectDAO;
import model.Subject;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectDAO subjectDAO;

    @Override
    public void save(Subject sub) {
        subjectDAO.save(sub);
    }

    @Override
    public List<Subject> findAll() {
        return subjectDAO.findAll();
    }

    @Override
    public Subject findById(int id) {
        return subjectDAO.findById(id).orElse(null);
    }
}