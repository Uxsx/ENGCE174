import java.util.Scanner ;

public class AddNtoMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        int n = scanner.nextInt() ;

        int[] num = new int[n] ;
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt() ;
        }

        int max = num[0] ;
        for (int i = 1; i < n; i++) {
            if (num[i] > max) {
                max = num[i] ;
            }
        }

        System.out.println(max) ;

        scanner.close() ;
    }
}