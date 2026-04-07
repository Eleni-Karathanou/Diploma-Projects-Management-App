package controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Application;
import model.Professor;
import model.Subject;
import model.Thesis;
import service.ProfessorService;
import service.SubjectService;
import service.UserService;

@Controller
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    private UserService userService;
    
    @Autowired
    private ProfessorService profService;
    
    @Autowired
    private SubjectService subService;

    public ProfessorController() {
    }

    @GetMapping("/dashboard")
    public String getProfessorMainMenu() {
        return "professor/dashboard"; 
    }

    @GetMapping("/profile")
    public String retrieveProfile(Model model, Principal principal) {
        String username = principal.getName(); 
        Professor prof = profService.retrieveProfile(username);
        
        model.addAttribute("professor", prof);
        return "professor/profile";
    }

    @PostMapping("/profile/save")
    public String saveProfile(@ModelAttribute("professor") Professor prof) {
        profService.saveProfile(prof);
        return "redirect:/professor/profile";
    }

    @GetMapping("/subjects")
    public String listProfessorSubjects(Model model, Principal principal) {
        String username = principal.getName();
        List<Subject> subjects = profService.listProfessorSubjects(username);
        
        model.addAttribute("subjects", subjects);
        return "professor/subjects_list";
    }

    @GetMapping("/subjects/new")
    public String showSubjectForm(Model model) {
        model.addAttribute("subject", new Subject(null)); 
        return "professor/subject_form";
    }

    @PostMapping("/subjects/save")
    public String addSubject(@ModelAttribute("subject") Subject sub, Principal principal) {
        String username = principal.getName();
        profService.addSubject(username, sub);
        return "redirect:/professor/subjects";
    }

    @GetMapping("/applications/{id}")
    public String listApplications(@PathVariable("id") Integer inter, Model model, Principal principal) {
        String username = principal.getName();
        List<Application> applications = profService.listApplications(username, inter);
        
        model.addAttribute("applications", applications);
        model.addAttribute("subjectId", inter);
        return "professor/applications_list";
    }

    @PostMapping("/applications/{id}/assign")
    public String assignSubject(@PathVariable("id") Integer inter, Principal principal) {
        String username = principal.getName();
        profService.assignSubject(username, inter);
        return "redirect:/professor/theses";
    }

    @GetMapping("/theses")
    public String listProfessorTheses(Model model, Principal principal) {
        String username = principal.getName();
        List<Thesis> theses = profService.listProfessorTheses(username);
        
        model.addAttribute("theses", theses);
        return "professor/theses_list";
    }
}