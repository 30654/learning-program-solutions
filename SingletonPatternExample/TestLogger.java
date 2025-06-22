public class TestLogger {
    public static void main(String[] args) {
        // Attempt to get Logger instance multiple times
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Use the logger
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        // Check if both references point to the same object
        if (logger1 == logger2) {
            System.out.println("Only one Logger instance is used across the application.");
        } else {
            System.out.println("Multiple instances of Logger exist.");
        }
    }
}
