public class BankAccount2 {
    // Attributes
    private String ownerName;
    private double balance;

    // Constructor
    public BankAccount2(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    // Method: withdraw
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= this.balance) {
                this.balance -= amount;
                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Insufficient funds.");
            }
        }
    }

    // Method: displayBalance
    public void displayBalance() {
        System.out.printf("Balance: %.1f\n", this.balance);
    }
}