package model;

import org.springframework.stereotype.Component;

@Component //Component για να μπορεί το Spring να το κάνει @Autowired στα Services
public class BestApplicantStrategyFactory {

    public BestApplicantStrategyFactory() {
    }
    
    // επιστρέφει το σωστό αντικείμενο Στρατηγικής
    public BestApplicantStrategy createStrategy(String strategyType) {
        
        if (strategyType == null) {
            throw new IllegalArgumentException("Strategy type cannot be null");
        }
        
        switch (strategyType.toLowerCase()) {
            case "bestgrade":
                return new BestAvgGradeStrategy();
                
            case "fewestcourses":
                return new FewestCoursesStrategy();
                
                
            default:
                throw new IllegalArgumentException("Unknown strategy type: " + strategyType);
        }
    }
}
