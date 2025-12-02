public class BankAccount {
    private String name ;
    private double balance ;

    public BankAccount(String n, double balance) {
        this.name = n ;
        this.balance = balance ;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void displaySummary() {
        System.out.println("Owner: " + name) ;
        System.out.println("Balance: " + String.format("%.2f", balance)) ; 
    }
}
