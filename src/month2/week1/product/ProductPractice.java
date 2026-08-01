package month2.week1.product;

public class ProductPractice {
    public static void main(String[] args) {
        Product product1 = new Product("Farinha de Carne", 100.00, 30);
        Product product2 = new Product("Farinha de Pena", 55.55, 30);
        Product product3 = new Product("Farinha de Ossos", 74.37, 30);

        System.out.printf("Total stock value of the product %s is %.2f%n", product1.name, product1.calculateStockValue());
        System.out.printf("Total stock value of the product %s is %.2f%n", product2.name, product2.calculateStockValue());
        System.out.printf("Total stock value of the product %s is %.2f%n", product3.name, product3.calculateStockValue());

    }
}
