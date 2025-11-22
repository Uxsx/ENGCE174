import java.util.Scanner ;

public class InvManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        int n = scanner.nextInt() ;

        int[] productID = new int[n] ;
        int[] stockItems = new int[n] ;

        for (int i = 0; i < n; i++) {
            productID[i] = scanner.nextInt() ;
            stockItems[i] = scanner.nextInt() ;
        }

        int searchID = scanner.nextInt() ;

        boolean isFound = false ;

        for (int i = 0; i < n; i++) {
            if (productID[i] == searchID) {
                System.out.println("จำนวนคงคลัง : " + stockItems[i]) ;
                isFound = true ; 
                break ;
            }
        }

        if (!isFound) {
            System.out.print("Product " + searchID + " not found") ;
        }

        scanner.close() ;
    }
    
}
