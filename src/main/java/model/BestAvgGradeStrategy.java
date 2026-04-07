package model;

public class BestAvgGradeStrategy extends TemplateStrategyAlgorithm {

    public BestAvgGradeStrategy() {
    }

    @Override
    public int compareApplications(Application app1, Application app2) {
        return Integer.compare(
            app1.getStudent().getCurrentAvgGrade(), 
            app2.getStudent().getCurrentAvgGrade()
        );
    }
}