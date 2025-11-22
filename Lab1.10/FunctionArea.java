import java.util.Scanner ;

public class FunctionArea {
    
    public static double calculateArea(double width, double height){
        double area = width * height ;
        return area ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        double width = scanner.nextDouble() ;
        double height = scanner.nextDouble() ;

        double result = calculateArea(width, height) ;
        System.out.println(result) ;

        scanner.close() ;
    }

}
