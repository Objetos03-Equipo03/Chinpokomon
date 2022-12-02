package logger;

public enum Level {
    ERROR(5),
    WARN(4),
    INFO(4),
    DEBUG(4);

    public final int level;

    private Level(int level) {
        this.level = level;
    }

}
