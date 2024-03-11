public class FileHandler extends Handler {
    public FileHandler(int level) {
        this.level = level;
    }

    public void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}