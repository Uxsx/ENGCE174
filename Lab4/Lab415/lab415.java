package Lab415;

import java.util.Arrays;
import java.util.Scanner;

class AuditRecord {
    private final String user;
    private final String[] logMessages;
    private static int maxMessages = 3;

    public AuditRecord(String user) {
        this(user, new String[0]);
    }

    public AuditRecord(String user, String[] logs) {
        this.user = user;
        if (logs.length > maxMessages) {
            this.logMessages = Arrays.copyOfRange(logs, logs.length - maxMessages, logs.length);
        } else {
            this.logMessages = Arrays.copyOf(logs, logs.length);
        }
    }

    public static void setPolicy(int max) {
        if (max > 0) {
            maxMessages = max;
            System.out.println("Policy set to " + max);
        } else {
            System.out.println("Invalid policy.");
        }
    }

    public AuditRecord addMessage(String message) {
        if (this.logMessages.length < maxMessages) {
            String[] newLogs = Arrays.copyOf(this.logMessages, this.logMessages.length + 1);
            newLogs[newLogs.length - 1] = message;
            
            System.out.println(message + " added.");
            return new AuditRecord(this.user, newLogs);
        } else {
            System.out.println("Log is full.");
            return this;
        }
    }

    public void displayLog() {
        String logsString = String.join(", ", logMessages);
        System.out.printf("User: %s, Logs: %d [%s]%n", user, logMessages.length, logsString);
    }
}

public class lab415 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            AuditRecord.setPolicy(scanner.nextInt());
            scanner.nextLine();
        }

        if (scanner.hasNextLine()) {
            String username = scanner.nextLine();
            AuditRecord record = new AuditRecord(username);

            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                scanner.nextLine();

                for (int i = 0; i < n; i++) {
                    if (scanner.hasNextLine()) {
                        record = record.addMessage(scanner.nextLine());
                    }
                }
            }
            record.displayLog();
        }
        scanner.close();
    }
}