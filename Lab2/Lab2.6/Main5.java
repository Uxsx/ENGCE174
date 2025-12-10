import java.util.Scanner ;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.print("account owner name: ") ;
        String owNa = scanner.nextLine();

        System.out.print("initial balance: ") ;
        double inBa = scanner.nextDouble();
        
        scanner.nextLine() ; 

        System.out.print("deposit amount: ") ;
        double depositAmount = scanner.nextDouble() ;
        
        scanner.nextLine() ;

        scanner.close() ;
        
        BankAccount3 acc = new BankAccount3(owNa, inBa) ;

        acc.deposit(depositAmount) ;

        acc.displaySummary() ;
    }
}