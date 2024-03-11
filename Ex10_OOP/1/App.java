public class App {
    public static void main(String[] args) {
        IHandler errorHandler = new ErrorHandler(Handler.ERROR);
        IHandler fileHandler = new FileHandler(Handler.DEBUG);
        IHandler consoleHandler = new ConsoleHandler(Handler.INFO);

        errorHandler.setHandler(fileHandler);
        fileHandler.setHandler(consoleHandler);

        errorHandler.logMessage(Handler.INFO, "This is an information.");
        errorHandler.logMessage(Handler.DEBUG, "This is a debug information.");
        errorHandler.logMessage(Handler.ERROR, "This is an error information.");
    }
}