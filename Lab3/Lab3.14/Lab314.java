import java.util.Scanner;

class BankAccount {
    private double balance ;
    
    private static int totalTransactionCount = 0 ;

    public BankAccount(double initialDeposit) {
        if (initialDeposit >= 0) {
            this.balance = initialDeposit ;
        } else {
            this.balance = 0 ;
        }
        System.out.println("Account created.") ;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount ;
            totalTransactionCount++ ;
            System.out.println("Deposit successful.") ;
        } else {
            System.out.println("Invalid amount.") ;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount ;
            totalTransactionCount++;
            System.out.println("Withdrawal successful.") ;
        } else if (amount > this.balance) {
            System.out.println("Insufficient funds.") ;
        } else {
            System.out.println("Invalid amount.") ;
        }
    }

    public double getBalance() {
        return this.balance ;
    }

    public static int getTotalTransactionCount() {
        return totalTransactionCount ;
    }
}

public class Lab314 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        
        BankAccount myAcc = null ;

        if (scan.hasNextInt()) {
            int n = scan.nextInt() ;

            for (int i = 0; i < n; i++) {
                String cmd = scan.next() ;

                switch (cmd) {
                    case "CREATE":
                        double initialAmount = scan.nextDouble() ;
                        myAcc = new BankAccount(initialAmount) ;
                        break ;

                    case "DEPOSIT":
                        double depAmount = scan.nextDouble() ;
                        if (myAcc == null) {
                            System.out.println("No account exists.") ;
                        } else {
                            myAcc.deposit(depAmount) ;
                        }
                        break;

                    case "WITHDRAW":
                        double withAmount = scan.nextDouble() ;
                        if (myAcc == null) {
                            System.out.println("No account exists.") ;
                        } else {
                            myAcc.withdraw(withAmount) ;
                        }
                        break;

                    case "STATUS":
                        if (myAcc == null) {
                            System.out.println("No account exists.") ;
                        } else {
                            System.out.println("Balance: " + myAcc.getBalance()) ;
                        }
                        break ;

                    case "GLOBAL_STATUS":
                        System.out.println("Total Transactions: " + BankAccount.getTotalTransactionCount()) ;
                        break ;
                }
            }
        }
        scan.close() ;
    }
}