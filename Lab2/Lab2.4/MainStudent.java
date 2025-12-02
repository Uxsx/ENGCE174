import java.util.Scanner ;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        System.out.print("Name: ") ;
        String na = scan.nextLine() ;

        System.out.print("Midterm Score: ") ;
        int ms = scan.nextInt() ;

        System.out.print("Final Score: ") ;
        int fs = scan.nextInt() ;

        Students std = new Students(na, ms, fs) ;

        std.displaySummary() ;

        scan.close();
    }
}
