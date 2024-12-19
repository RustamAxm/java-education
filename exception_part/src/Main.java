import java.util.logging.*;

public class Main {
    public static double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        }
        return Math.sqrt(x);
    }

    private static void configureLogging() {
        // your implementation here
        Logger LOGGER1 = Logger.getLogger("org.stepic.java.logging.ClassA");
        LOGGER1.setLevel(Level.ALL);

        Logger LOGGER2 = Logger.getLogger("org.stepic.java.logging.ClassB");
        LOGGER2.setLevel(Level.WARNING);

        Logger LOGGER3 = Logger.getLogger("org.stepic.java");
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setFormatter(new XMLFormatter());
        LOGGER3.addHandler(handler);
        LOGGER3.setUseParentHandlers(false);
    }

    public static void main(String[] args) {

        System.out.println(sqrt(2));
        try {
            System.out.println(sqrt(-1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Logger log = Logger.getLogger("demo");
        log.log(Level.INFO, "from logger");
    }
}