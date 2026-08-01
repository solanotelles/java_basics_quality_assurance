package month2.week1.product;

public class Product {
    String name;
    double price;
    int stockQuantity;

    Product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    double calculateStockValue() {
        return price * stockQuantity;
    }
}
