import java.util.Scanner ;

public class FunctionSumN {

    public static int sumArray(int[] numbers) {

        int sum = 0 ;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i] ;
        }
        return sum ;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        int n = scanner.nextInt() ;

        int[] number = new int[n] ;

        for (int i = 0; i < n; i++) {
            number[i] = scanner.nextInt() ;
        }

        int result = sumArray(number) ;

        System.out.println(result) ;

        scanner.close() ;
    }
}