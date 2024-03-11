public class ErrorHandler extends Handler {
    public ErrorHandler(int level) {
        this.level = level;
    }

    public void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}