package month2.week1.rectangle;

public class Rectangle {
    double width, length;

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    double calculatePerimeter() {
        return (width * 2) + (length * 2);
    }

    double calculateArea() {
        return width * length;
    }
}
