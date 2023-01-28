package generative.abstractFactory.website;

import generative.abstractFactory.Developer;
import generative.abstractFactory.ProjectManager;
import generative.abstractFactory.ProjectTeamFactory;
import generative.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PHPDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
