package Lab415;

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
            this.logMessages = new String[maxMessages];
            System.arraycopy(logs, logs.length - maxMessages, this.logMessages, 0, maxMessages);
        } else {
            this.logMessages = new String[logs.length];
            System.arraycopy(logs, 0, this.logMessages, 0, logs.length);
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
            // สร้างอาเรย์ใหม่ที่มีขนาดเพิ่มขึ้น 1
            String[] newLogs = new String[this.logMessages.length + 1];
            System.arraycopy(this.logMessages, 0, newLogs, 0, this.logMessages.length);
            newLogs[this.logMessages.length] = message;
            
            System.out.println(message + " added.");
            return new AuditRecord(this.user, newLogs);
        } else {
            System.out.println("Log is full.");
            return this;
        }
    }

    public void displayLog() {
        System.out.print("User: " + user + ", Logs: " + logMessages.length + " [");
        for (int i = 0; i < logMessages.length; i++) {
            System.out.print(logMessages[i] + (i == logMessages.length - 1 ? "" : ", "));
        }
        System.out.println("]");
    }
}

public class lab415 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int policy = scanner.nextInt();
            AuditRecord.setPolicy(policy);
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
                        String msg = scanner.nextLine();
                        record = record.addMessage(msg);
                    }
                }
            }
            
            record.displayLog();
        }
        scanner.close();
    }
}
