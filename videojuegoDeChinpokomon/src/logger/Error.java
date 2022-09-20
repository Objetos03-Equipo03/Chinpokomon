package logger;

public class Error extends Level{

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

        message = null;
    }

    @Override
    public void error(String message) {
        System.out.println("error: " + message);
    }
}
