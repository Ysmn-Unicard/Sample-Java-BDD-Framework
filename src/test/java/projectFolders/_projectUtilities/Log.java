package projectFolders._projectUtilities;

import org.apache.log4j.Logger;

public abstract class Log {

    // Initialize Log4j logs

    private static Logger Log = Logger.getLogger(Log.class.getName());//

    // This is to print log for the beginning of the test case, as we usually run so many test cases as a test suite

    public abstract void startTestCase();
    public abstract void endTestCase();

    public static void info(String message) {

        Log.info(message);

    }

    public static void warn(String message) {

        Log.warn(message);

    }

    public static void error(String message) {

        Log.error(message);

    }

    public static void fatal(String message) {

        Log.fatal(message);

    }

    public static void debug(String message) {

        Log.debug(message);

    }
}
