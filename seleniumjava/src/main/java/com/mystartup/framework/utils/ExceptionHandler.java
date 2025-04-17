public class ExceptionHandler {
    
    public static void handleException(Exception e) {
        // Log the exception
        LoggerUtils.logError("An error occurred: " + e.getMessage());

        // Take a screenshot if needed
        ScreenshotUtils.takeScreenshot();

        // Optionally, rethrow the exception or exit the program
        // throw e; // Uncomment to rethrow
        // System.exit(1); // Uncomment to exit
    }

    public static void handleAssertionError(AssertionError e) {
        // Log the assertion error
        LoggerUtils.logError("Assertion failed: " + e.getMessage());

        // Take a screenshot if needed
        ScreenshotUtils.takeScreenshot();

        // Optionally, rethrow the assertion error or exit the program
        // throw e; // Uncomment to rethrow
        // System.exit(1); // Uncomment to exit
    }   
    
    
}
