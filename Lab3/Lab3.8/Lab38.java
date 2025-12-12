import java.util.Scanner;

class InventoryItem {
    private String productName;
    private int stock;

    public InventoryItem(String productName, int initialStock) {
        this.productName = productName;

        if (initialStock >= 0) {
            this.stock = initialStock;
        } else {
            this.stock = 0;
        }
    }

    public String getProductName() {
        return this.productName;
    }

    public int getStock() {
        return this.stock;
    }

    public void addStock(int amount) {
        if (amount > 0) {
            this.stock += amount;
            System.out.println("Stock added."); 
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void sellStock(int amount) {
        if (amount > 0 && amount <= this.stock) {
            this.stock -= amount;
            System.out.println("Sale successful."); 
        } else {
            if (amount > this.stock) {
                 System.out.println("Not enough stock");
            } else {
                 System.out.println("Invalid amount");
            }
        }
    }
}

public class Lab38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namePro = scanner.nextLine();
        int norStock = scanner.nextInt();

        InventoryItem Invitem = new InventoryItem(namePro, norStock);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String command = scanner.next();
            int amount = scanner.nextInt();

            if (command.equalsIgnoreCase("ADD")) {
                Invitem.addStock(amount);
            } else if (command.equalsIgnoreCase("SELL")) {
                Invitem.sellStock(amount);
            }
        }

        System.out.println("Final Stock: " + Invitem.getStock());
        
        scanner.close();
    }
}