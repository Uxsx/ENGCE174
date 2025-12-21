package Lab413;
import java.util.Scanner;

class Subscription {
    private final String planName;
    private final int durationDays;

    private static int maxDuration = 365;

    public Subscription(String planName, int durationDays) {
        this.planName = planName; 
        
        if (durationDays > maxDuration) {
            this.durationDays = maxDuration;
        } else if (durationDays < 0) {
            this.durationDays = 0; 
        } else {
            this.durationDays = durationDays;
        }
    }

    // Copy Constructor
    public Subscription(Subscription other) {
        this.planName = other.planName; 
        this.durationDays = other.durationDays; 
    }

    public static void setMaxDuration(int max) {
        if (max > 0) {
            maxDuration = max; 
            System.out.println("Max duration set to " + max);
        } else {
            System.out.println("Invalid max policy."); 
        }
    }

    public Subscription extend(int days) {
        if (days <= 0) {
            System.out.println("Invalid extension days.");
            return this;
        }

        int newDays = this.durationDays + days;
        if (newDays > maxDuration) {
            System.out.println("Extension failed: Exceeds max policy.");
            return this;
        }

        System.out.println("Extension successful.");
        return new Subscription(this.planName, newDays);
    }

    public void displayInfo() {
        System.out.println("Plan: " + planName + ", Days: " + durationDays);
    }
}

public class lab413 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int policy = scanner.nextInt();
        Subscription.setMaxDuration(policy);
        scanner.nextLine(); 

        String name = scanner.nextLine();
        int initialDays = scanner.nextInt();
        Subscription sub = new Subscription(name, initialDays);

        int ext1 = scanner.nextInt();
        sub = sub.extend(ext1);

        int ext2 = scanner.nextInt();
        sub = sub.extend(ext2);

        sub.displayInfo();

        scanner.close();
    }
}
