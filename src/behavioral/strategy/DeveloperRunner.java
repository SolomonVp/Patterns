package behavioral.strategy;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new Speeping());
        developer.executeActivity();

        developer.setActivity(new Trading());
        developer.executeActivity();

        developer.setActivity(new Coding());
        developer.executeActivity();

        developer.setActivity(new Reading());
        developer.executeActivity();
    }
}
