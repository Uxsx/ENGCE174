import java.util.Scanner ;

public class Multiplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        int mom = scanner.nextInt() ;

        for (int i = 1; i <= 12; i++) {
            int result = mom * i ;
            System.out.println(mom + " x " + i + " = " + result) ;
        }

        scanner.close() ;
    }
}