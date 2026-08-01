package month2.week1.rectangle;

public class RectanglePractice {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 5);
        Rectangle rectangle2 = new Rectangle(5.5, 6.7);
        Rectangle rectangle3 = new Rectangle(8.3, 27.7);

        System.out.printf("Rectangle 1: %nPerimeter: %.2f%nArea: %.2f%n%n", rectangle1.calculatePerimeter(), rectangle1.calculateArea());
        System.out.printf("Rectangle 2: %nPerimeter: %.2f%nArea: %.2f%n%n", rectangle2.calculatePerimeter(), rectangle2.calculateArea());
        System.out.printf("Rectangle 3: %nPerimeter: %.2f%nArea: %.2f%n%n", rectangle3.calculatePerimeter(), rectangle3.calculateArea());
    }
}
