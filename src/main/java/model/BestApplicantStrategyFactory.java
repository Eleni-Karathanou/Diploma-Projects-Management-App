package model;

import org.springframework.stereotype.Component;

@Component // Το κάνουμε Component για να μπορεί το Spring να το κάνει @Autowired στα Services σου
public class BestApplicantStrategyFactory {

    public BestApplicantStrategyFactory() {
    }
    
    // Η μόνη δουλειά του Factory: να επιστρέφει το σωστό αντικείμενο Στρατηγικής
    public BestApplicantStrategy createStrategy(String strategyType) {
        
        if (strategyType == null) {
            throw new IllegalArgumentException("Strategy type cannot be null");
        }
        
        switch (strategyType.toLowerCase()) {
            case "bestgrade":
                return new BestAvgGradeStrategy();
                
            case "fewestcourses":
                return new FewestCoursesStrategy();
                
            // Μπορείς να προσθέσεις κι άλλες στρατηγικές εδώ στο μέλλον (π.χ. "random", "threshold")
                
            default:
                throw new IllegalArgumentException("Unknown strategy type: " + strategyType);
        }
    }
}