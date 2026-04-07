package service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.ProfessorDAO;
import dao.SubjectDAO;
import dao.ApplicationDAO;
import dao.ThesisDAO;
import model.Application;
import model.Professor;
import model.Subject;
import model.Thesis;

@Service
public class ProfessorServiceImpl implements ProfessorService {

    @Autowired
    private ProfessorDAO professorDAO;
    
    @Autowired
    private SubjectDAO subjectDAO;
    
    @Autowired
    private ApplicationDAO applicationDAO;
    
    @Autowired
    private ThesisDAO thesisDAO;

    private int implGrade;
    private int reportGrade;
    private int presGrade;
    private double overallGrade;

    public ProfessorServiceImpl() {
    }

    @Override
    public Professor retrieveProfile(String prof) {
        return professorDAO.findAll().stream()
                .filter(p -> p.getFullName().equals(prof))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void saveProfile(Professor professor) {
        professorDAO.save(professor);
    }

    @Override
    public List<Subject> listProfessorSubjects(String list) {
        return subjectDAO.findAll();
    }

    @Override
    public void addSubject(String str, Subject sub) {
        subjectDAO.save(sub);
    }

    @Override
    public List<Application> listApplications(String str, Integer inter) {
        return applicationDAO.findAll();
    }

    @Override
    public List<Thesis> listProfessorTheses(String str) {
        return thesisDAO.findAll();
    }

    @Override
    public void assignSubject(String str, Integer inter) {
    }

    @Override
    public void delSubject(String str, Subject sub) {
        subjectDAO.delete(sub);
    }

    @Override
    public void setOverallGrade(double overallGrade) {
        this.overallGrade = 0.7 * this.getImplGrade() + 0.15 * this.getReportGrade() + 0.15 * this.getPresGrade();
    }

    @Override
    public void setImplGrade(int implGrade) {
        this.implGrade = implGrade;
    }

    @Override
    public void setReportGrade(int reportGrade) {
        this.reportGrade = reportGrade;
    }

    @Override
    public void setPresGrade(int presGrade) {
        this.presGrade = presGrade;
    }

    @Override
    public int getImplGrade() {
        return implGrade;
    }

    @Override
    public int getReportGrade() {
        return reportGrade;
    }

    @Override
    public int getPresGrade() {
        return presGrade;
    }

    @Override
    public double getOverallGrade() {
        return overallGrade;
    }
}