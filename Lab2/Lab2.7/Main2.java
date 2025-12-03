import java.util.Scanner ;

public class Main2 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in) ;

        System.out.print("Input name: ") ;
        String ownerName = sca.nextLine() ; 
        System.out.print("Input Balance: ") ;
        double initialBalance = sca.nextDouble() ;
        System.out.print("Input withdraw 1: ") ;
        double withdrawal1 = sca.nextDouble() ;
        System.out.print("Input withdraw 2: ") ;
        double withdrawal2 = sca.nextDouble() ;
        
        sca.close() ;

        BankAccount2 acc = new BankAccount2(ownerName, initialBalance) ;

        acc.withdraw(withdrawal1) ;

        acc.withdraw(withdrawal2) ;

        acc.displayBalance() ;
    }
}