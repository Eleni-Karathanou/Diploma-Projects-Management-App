package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import java.util.List;

public class BestAvgGradeStrategyTest {

    @Test
    public void testFindBestApplicant() {
        Student student1 = new Student("Maria", 4, 7, 5);
        Student student2 = new Student("Nikos", 4, 9, 3);
        
        Subject subject = new Subject("AI Research");
        
        Application app1 = new Application(student1, subject);
        Application app2 = new Application(student2, subject);
        
        List<Application> applications = new ArrayList<>();
        applications.add(app1);
        applications.add(app2);
        
        BestAvgGradeStrategy strategy = new BestAvgGradeStrategy();
        Student bestStudent = strategy.findBestApplicant(applications);
        
        assertNotNull(bestStudent);
        assertEquals("Nikos", bestStudent.getFullName());
        assertEquals(9, bestStudent.getCurrentAvgGrade());
    }
}