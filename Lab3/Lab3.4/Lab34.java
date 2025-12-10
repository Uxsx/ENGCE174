import java.util.Scanner ;

class Product {
    private String name ;

    private static int productCount = 0;

    public Product(String name) {
        this.name = name ;
        productCount++ ;
    }

    public String getName() { return name ; }

    public static int getProductCount() { return productCount ; }

}

public class Lab34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.print("Input count: ") ;
        int n = scanner.nextInt() ;
        scanner.nextLine()  ;

        for (int i = 0; i < n; i++) {
            String productName = scanner.nextLine() ;
            new Product(productName) ;
        }

        System.out.print(Product.getProductCount()) ;

        scanner.close() ;
    }
}
