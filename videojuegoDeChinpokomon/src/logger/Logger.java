package logger;

public final class Logger {

    private static Logger instance;

    private static Level level;

    public Logger(Level level) {
        Logger.level = level;
    }

    public static Logger getInstance(Level level){
        if (instance == null) {
            instance = new Logger(level);
        }
        return instance;
    }

    public void setLevel(Level level){
        Logger.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public void debug(String message) {
        level.debug(message);
    }

    public void info(String message) {
        level.info(message);
    }

    public void warn(String message) {
        level.warn(message);
    }

    public void error(String message) {
        level.error(message);
    }
}
