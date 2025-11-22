import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in) ;

        double width = scanner.nextDouble() ;
        double height = scanner.nextDouble() ;

        double area = width * height ;

        System.out.println(area) ;

        scanner.close() ;
    }
}