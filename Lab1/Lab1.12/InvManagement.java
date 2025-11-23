import java.util.Scanner ;

public class InvManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        int n = scanner.nextInt() ;

        int[] proID = new int[n] ;
        int[] stoItem = new int[n] ;

        for (int i = 0; i < n; i++) {
            proID[i] = scanner.nextInt() ;
            stoItem[i] = scanner.nextInt() ;
        }

        int seID = scanner.nextInt() ;

        boolean isFoun = false ;

        for (int i = 0; i < n; i++) {
            if (proID[i] == seID) {
                System.out.println(proID[i]) ;
                isFoun = true ; 
                break ;
            }
        }

        if (isFoun == false) {
            System.out.print("Product " + seID + " not found") ;
        }

        scanner.close() ;
    }
}
