import java.util.Scanner ;

public class SumLoopN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.print("กรุณาตัวเลขที่ต้องการป้อน: ") ;
        int n = scanner.nextInt() ;

        int sum = 0 ;

        for (int i = 1; i <= n; i++) {
            int number = scanner.nextInt() ;
            sum += number ;
        }

        System.out.println(sum) ;

        scanner.close() ;
    }
}