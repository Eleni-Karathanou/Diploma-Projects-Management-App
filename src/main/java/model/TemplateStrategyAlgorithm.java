package model;

import java.util.List;

public abstract class TemplateStrategyAlgorithm implements BestApplicantStrategy {

    public TemplateStrategyAlgorithm() {
    }

    public abstract int compareApplications(Application app1, Application app2);

    @Override
    public Student findBestApplicant(List<Application> app) {
        if (app == null || app.isEmpty()) {
            return null;
        }

        Application bestApp = app.get(0);
        for (int i = 1; i < app.size(); i++) {
            if (compareApplications(app.get(i), bestApp) > 0) {
                bestApp = app.get(i);
            }
        }
        return bestApp.getStudent();
    }
}