package logger;

public class Warn extends Level{
    @Override
    public void debug(String message) {
        message = null;
    }

    @Override
    public void info(String message) {
        message = null;
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
