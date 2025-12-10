import java.util.Scanner;

public class MainShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        ShoppingCart cart = new ShoppingCart();

        for (int i = 0; i < N; i++) {
            String name = scanner.nextLine();

            double price = scanner.nextDouble();
            scanner.nextLine();

            Product product = new Product(name, price);
            cart.addProduct(product);
        }

        double total = cart.calculateTotalPrice();
        System.out.print("Total Price "+ total);

        scanner.close();
    }
}