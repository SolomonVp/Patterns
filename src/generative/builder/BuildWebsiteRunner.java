package generative.builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new EnterpriseWebsiteBuilder());
//        director.setBuilder(new VisitCardWebsiteBuilder());
        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
