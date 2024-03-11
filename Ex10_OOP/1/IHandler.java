public interface IHandler {
    public void setHandler(IHandler nextLogger);
    public void logMessage(int level, String message);
}