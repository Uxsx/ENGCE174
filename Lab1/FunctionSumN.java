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

        System.out.print("กรุณาตัวเลขที่ต้องการป้อน: ") ;
        int n = scanner.nextInt() ;

        int[] userNumbers = new int[n];

        for (int i = 0; i < n; i++) {
            userNumbers[i] = scanner.nextInt() ;
        }

        int totalResult = sumArray(userNumbers) ;

        System.out.println(totalResult) ;

        scanner.close() ;
    }
}