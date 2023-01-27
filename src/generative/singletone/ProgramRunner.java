package generative.singletone;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().toString();
        ProgramLogger.getProgramLogger().toString();
        ProgramLogger.getProgramLogger().toString();
        ProgramLogger.getProgramLogger().toString();
        ProgramLogger.getProgramLogger().toString();
        ProgramLogger.getProgramLogger().toString();
        ProgramLogger.getProgramLogger().toString(); //проверка на то что это один и тот же экземпляр

        ProgramLogger.getProgramLogger().addLogInfo("First log...");
        ProgramLogger.getProgramLogger().addLogInfo("Second log...");
        ProgramLogger.getProgramLogger().addLogInfo("Thirty log...");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
