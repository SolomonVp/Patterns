package generative.abstractFactory.banking;

import generative.abstractFactory.Developer;
import generative.abstractFactory.ProjectManager;
import generative.abstractFactory.ProjectTeamFactory;
import generative.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
