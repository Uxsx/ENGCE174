import java.util.Scanner ;

public class AddNtoMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.print("กรุณาระบุจำนวนตัวเลข : ");
        int n = scanner.nextInt() ;

        int[] numbers = new int[n] ;

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt() ;
        }

        int max = numbers[0] ;

        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i] ;
            }
        }

        System.out.println("ค่าที่มากที่สุด คือ: " + max) ;

        scanner.close() ;
    }
}