import java.util.Scanner;

class SystemLogger {
    private static int currentLogLevel = 1;

    private static String getLevelName(int level) {
        switch (level) {
            case 1:
                return "INFO";
            case 2:
                return "DEBUG";
            case 3:
                return "ERROR";
            default:
                return "UNKNOWN";
        }
    }

    public static void setLogLevel(int newLevel) {
        if (newLevel >= 1 && newLevel <= 3) {
            currentLogLevel = newLevel;
            System.out.println("Log level set to " + getLevelName(newLevel));
        } else {
            System.out.println("Invalid log level.");
        }
    }

    public static void log(int messageLevel, String message) {
        if (messageLevel >= currentLogLevel) {
            String levelName = getLevelName(messageLevel);
            System.out.println("[" + levelName + "]: " + message);
        }
    }
}

public class Lab310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                String command = sc.next();

                if (command.equals("SET")) {
                    int level = sc.nextInt();
                    SystemLogger.setLogLevel(level);
                } else if (command.equals("LOG")) {
                    int level = sc.nextInt();
                    sc.nextLine();
                    String message = sc.nextLine();
                    SystemLogger.log(level, message);
                }
            }
        }
        
        sc.close();
    }
}