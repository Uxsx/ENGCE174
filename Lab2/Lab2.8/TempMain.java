import java.util.Scanner;

public class TempMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("(C_TO_F) OR (F_TO_C): ");
        String mode = scanner.nextLine().trim();
        System.out.print("INPUT TEMP: ");
        double temp = scanner.nextDouble();
        
        scanner.close();

        double result = 0.0;

        if (mode.equalsIgnoreCase("C_TO_F")) {
            result = TempConvert.celsiusToFahrenheit(temp);
        } else if (mode.equalsIgnoreCase("F_TO_C")) {
            result = TempConvert.fahrenheitToCelsius(temp);
        }

        System.out.println(result); 
    }
}