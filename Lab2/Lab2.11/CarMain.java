import java.util.Scanner ;

public class CarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        
        System.out.print("Car Model: ") ;
        String modelInput = scanner.nextLine() ;

        System.out.print("Model Create Year: ") ;
        int yearInput = scanner.nextInt() ;
        scanner.nextLine() ;

        System.out.print("Model New Year: ") ;
        int newYearInput = scanner.nextInt() ;
        scanner.nextLine() ;

        Car myCar = new Car(modelInput, yearInput) ;

        myCar.setYear(newYearInput) ;

        System.out.println("Model: " + myCar.getModel()) ;
        System.out.println("Year: " + myCar.getYear()) ;
        
        scanner.close() ;
    }
}