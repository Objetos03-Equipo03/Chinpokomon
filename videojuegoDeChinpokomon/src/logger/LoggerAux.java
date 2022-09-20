package logger;

public final class LoggerAux {
    
    private static LoggerAux instance;

    private String level;

    private static String debugLevel;

    private static String infoLevel;

    private static String warnLevel;

    private static String errorLevel;

    public LoggerAux(String level) {
        this.level = level;
    }

    public static LoggerAux getInstance(String level){
        if (instance == null) {
            instance = new LoggerAux(level);
        }
        return instance;
    }

    public void setLevel(String level){
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public String getDebug() {
        if(this.level != "info" && this.level != "warn" && this.level != "error"){
            return "debug: " + debugLevel + "info: " + infoLevel + "\n" +
                    "warn: " + "\n" + warnLevel + "error: " + "\n" + errorLevel;
        }else {
            return null;
        }
    }

    public String getInfo() {
        if(this.level != "warn" && this.level != "error"){
            return "info: " + infoLevel + "\n" + "warn: " + warnLevel + "\n" + "error: " + errorLevel;
        }else {
            return null;
        }
    }

    public String getWarn() {
        if(this.level != "error"){
            return "warn: " + warnLevel + "error: " + "\n" + errorLevel;
        }else {
            return null;
        }
    }

    public String getError() {
        return "error: " + errorLevel;
    }

    public static void debug(String message) {
        debugLevel = message;
    }

    public static void info(String message) {
       infoLevel = message;
    }

    public static void warn(String message) {
        warnLevel = message;
    }

    public static void error(String message) {
        errorLevel = message;
    }

}
