import java.util.Scanner ;

public class gameDashboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        int R = scanner.nextInt() ;
        int C = scanner.nextInt() ;

        int[][] grid = new int[R][C] ;
        int onCount = 0 ;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = scanner.nextInt() ;
                if (grid[i][j] == 1) {
                    onCount++ ;
                }
            }
        }

        System.out.println(onCount) ;

        scanner.close() ;
    }
}
