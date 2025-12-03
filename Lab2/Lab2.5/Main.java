import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        scanner.close();

        Rectangle myRectangle = new Rectangle(width, height);

        System.out.println("Area: " + myRectangle.getArea());
        System.out.println("Perimeter: " + myRectangle.getPerimeter());
    }
}
