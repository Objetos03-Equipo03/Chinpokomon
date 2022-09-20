package logger;

public class Debug extends Level{
    @Override
    public void debug(String message) {
        System.out.println("debug: " + message);
    }

    @Override
    public void info(String message) {
        System.out.println("info: " + message);
    }

    @Override
    public void warn(String message) {
        System.out.println("warn: " + message);
    }

    @Override
    public void error(String message) {
        System.out.println("error: " + message);
    }
}
