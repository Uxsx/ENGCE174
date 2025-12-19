package Lab42;
import java.util.Scanner;

class Product42 {
    private String name;
    private double price;

    public Product42(String name) {
        this(name, 0.0);
    }

    public Product42(String name,double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Product: " + this.name + "," + "Price: " + this.price);
    }
}

public class lab42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Select Mode 1 or 2: ");
        int m = scanner.nextInt();
        scanner.nextLine();

        if(m == 1) {
            String getNa = scanner.nextLine();
            Product42 product = new Product42(getNa);
            product.displayInfo();
        } else if(m == 2) {
            String getNa = scanner.nextLine();
            double getPr = scanner.nextDouble();
            Product42 product = new Product42(getNa, getPr);
            product.displayInfo();
        } else {
            System.out.println("Error pls Select Mode 1 or 2");
        }
        scanner.close();
    }
}
