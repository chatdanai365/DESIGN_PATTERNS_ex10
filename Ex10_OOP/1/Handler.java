public abstract class Handler implements IHandler {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;
    protected IHandler IHandler;

    public void setHandler(IHandler IHandler) {
        this.IHandler = IHandler;
    }
    
    public void logMessage(int level, String message) {
        if (this.level <= level) write(message);
        if (IHandler != null) IHandler.logMessage(level, message);
    }
    
    abstract public void write(String message);
}