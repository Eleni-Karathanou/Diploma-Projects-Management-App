package model;

public class FewestCoursesStrategy extends TemplateStrategyAlgorithm {

    public FewestCoursesStrategy() {
    }

    @Override
    public int compareApplications(Application app1, Application app2) {
        return Integer.compare(
            app2.getStudent().getRemainingCourses(), 
            app1.getStudent().getRemainingCourses()
        );
    }
}