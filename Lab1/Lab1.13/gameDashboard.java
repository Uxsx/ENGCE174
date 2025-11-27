import java.util.Scanner ;

public class gameDashboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        int R = scanner.nextInt() ;
        int C = scanner.nextInt() ;

        int[][] g = new int[R][C] ;
        int cou = 0 ;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                g[i][j] = scanner.nextInt() ;
                if (g[i][j] == 1) {
                    cou++ ;
                }
            }
        }

        System.out.println(cou) ;

        scanner.close() ;
    }
}