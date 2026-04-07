package service;

import java.util.List;
import model.Application;
import model.Professor;
import model.Subject;
import model.Thesis;

public interface ProfessorService {
    Professor retrieveProfile(String prof);
    void saveProfile(Professor professor);
    List<Subject> listProfessorSubjects(String list);
    void addSubject(String str, Subject sub);
    List<Application> listApplications(String str, Integer inter);
    List<Thesis> listProfessorTheses(String str);
    void assignSubject(String str, Integer inter);
    void delSubject(String str, Subject sub);
    void setImplGrade(int ImplGrade);
    void setReportGrade(int ReportGrade);
    void setPresGrade(int PresGrade);
    void setOverallGrade(double OverallGrade);
    int getImplGrade();
    int getReportGrade();
    int getPresGrade();
    double getOverallGrade();
}