package generative.abstractFactory.website;

import generative.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website Project...");
    }
}
