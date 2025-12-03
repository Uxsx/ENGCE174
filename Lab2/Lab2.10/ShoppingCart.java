public class ShoppingCart {
    private Product[] items ;
    private int itemCount ;

    public ShoppingCart(){
        this.items = new Product[10] ;
        this.itemCount = 0 ;
    }

    public void addProduct(Product p){
        if (itemCount < items.length) {
            items[itemCount] = p;
            itemCount++; 
        }
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getPrice();
        }
        return totalPrice;
    }
}
