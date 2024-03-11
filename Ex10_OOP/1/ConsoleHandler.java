public class ConsoleHandler extends Handler {
    public ConsoleHandler(int level) {
        this.level = level;
    }

    public void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}