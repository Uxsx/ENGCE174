import java.util.Scanner ;

class BankAccount36 {
    private double balance ;

    public BankAccount36(double intialBalance) {
        if(intialBalance >= 0) {
            this.balance = intialBalance ;
        } else {
            this.balance = 0 ;
        }
    }

    public double getBalance() {
        return this.balance ;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount ;
            System.out.println("Deposit Successful.") ;
        } else {
            System.out.println("Invalid deposit amount.") ;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0){
            if (amount <= this.balance) {
                this.balance -= amount ;
                System.out.println("Withdrawal successful.") ;
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

public class Lab36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        double onein = scanner.nextDouble() ;
        double twoin = scanner.nextDouble() ;
        double threein = scanner.nextDouble() ;

        BankAccount36 bankAccount36 = new BankAccount36(onein) ;

        bankAccount36.deposit(twoin) ;
        bankAccount36.withdraw(threein) ;

        System.out.print("Final Balance:" + bankAccount36.getBalance());
    }
}
