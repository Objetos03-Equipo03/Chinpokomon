package logger;

public class Logger {

    private static Logger instance;

    private static Level levelDefault = Level.DEBUG;

    public static void setLevel(Level level){
        Logger.levelDefault = level;
    }

    public static Logger getInstance(){
        if (instance == null) {
            instance = new Logger(levelDefault);
        }
        return instance;
    }

    private Level level;

    public void setLogLevel(Level level) {
        this.level = level;
    }

    private Logger(Level level){
        this.level = level;
    }

    public void debug(String message) {
        this.printMessage(level.DEBUG, message);
    }

    public void info(String message) {
        this.printMessage(level.INFO, message);;
    }

    public void warn(String message) {
        this.printMessage(level.WARN, message);;
    }

    public void error(String message) {
        this.printMessage(level.ERROR, message);;
    }

    public void printMessage(Level level, String msg) {
        if (this.level.level <= level.level) {
            System.out.println(msg);
        }
    }

}
