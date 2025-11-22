import java.util.Scanner ;

public class Multiplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        int n = scanner.nextInt() ;

        for (int i = 1; i <= 12 ; i++){
            int result = n * i ;
            System.out.println(n + " * " + i + " = " + result) ;
        }

        scanner.close() ;
    }
}