import java.util.Scanner ;

public class SumNumber {

    public static int calculateSum(int a, int b) {
        return a + b ;
    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in) ;

       int oneNumber = scanner.nextInt() ;
       int twoNumber = scanner.nextInt() ;

       int result = calculateSum(oneNumber, twoNumber) ;
       System.out.println(result) ;

       scanner.close();
    }
}