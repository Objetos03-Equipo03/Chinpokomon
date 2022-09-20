package logger;

public abstract class Level {


    public abstract void debug(String message);
    public abstract void info(String message);
    public abstract void warn(String message);
    public abstract void error(String message);
}
