import java.util.Scanner ;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        int n = scanner.nextInt() ;

        if (n < 0 || n > 100) {
            System.out.println("(0 - 100)");
        } else {
            if (n >= 80) {
                System.out.println("A") ;
            } else if (n >= 70) {
                System.out.println("B") ;
            } else if (n >= 60) {
                System.out.println("C") ;
            } else if (n >= 50) {
                System.out.println("D") ;
            } else {
                System.out.println("F") ;
            }
        }

        scanner.close() ;
    }
}