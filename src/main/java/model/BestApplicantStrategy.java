package model;

import java.util.List;

public interface BestApplicantStrategy {
    
    // The single contract for all strategies
    Student findBestApplicant(List<Application> applications);
    
}