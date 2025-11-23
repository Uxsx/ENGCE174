import java.util.Scanner ;

public class SumLoopN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        
        int n = scanner.nextInt() ;

        int s = 0 ;
        
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt() ;
            s += num ;
        }

        System.out.println(s) ;

        scanner.close() ;
    }
}