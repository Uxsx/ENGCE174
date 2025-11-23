import java.util.Scanner;

public class MakeGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        int R = scanner.nextInt() ;
        int C = scanner.nextInt() ;
        scanner.nextLine() ;

        char[][] map = new char[R][C] ;
        for (int i = 0; i < R; i++) {
            String line = scanner.nextLine() ;
            for (int j = 0; j < C; j++) {
                map[i][j] = line.charAt(j) ;
            }
        }

        int tarR = scanner.nextInt();
        int tarC = scanner.nextInt();

        if (map[tarR][tarC] == '*') {
            System.out.println("Mine");
        } else {
            int count = 0;

            int[] dR = {-1, -1, -1, 0, 0, 1, 1, 1};
            int[] dC = {-1, 0, 1, -1, 1, -1, 0, 1};

            for (int i = 0; i < 8; i++) {
                int newR = tarR + dR[i];
                int newC = tarC + dC[i];

                if (newR >= 0 && newR < R && newC >= 0 && newC < C) {
                    if (map[newR][newC] == '*') {
                        count++ ;
                    }
                }
            }

            System.out.println(count) ;
        }

        scanner.close() ;
    }
}
