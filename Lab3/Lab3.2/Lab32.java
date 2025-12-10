import java.util.Scanner ;

class Player {
    private int score ;

    public int getScore() { return this.score ; }

    public void setScore(int setScore) { this.score = setScore ;}

    public Player(int score) {
        this.score = score ;
    }
}


public class Lab32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.print("Score: ");
        int fs = scanner.nextInt() ;
        int ts = scanner.nextInt() ;

        Player pl = new Player(fs) ;
        pl.setScore(ts);

        System.out.print(pl.getScore());

        scanner.close();
    }
}
