package generative.abstractFactory.website;

import generative.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("ManualTester tests website...");
    }
}
