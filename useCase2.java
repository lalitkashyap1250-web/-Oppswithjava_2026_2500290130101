abstract class Shape {

    // Abstract method
    abstract double area();

    // Concrete method
    void displayArea() {
        System.out.println("Area = " + area());
    }
}


// Circle subclass
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Overriding area()
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}


// Rectangle subclass
class Rectangle extends Shape {
    double length;
    double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding area()
    @Override
    double area() {
        return length * width;
    }
}


// Driver class
public class useCase2 {
    public static void main(String[] args) {

        // Shape reference array
        Shape[] shapes = new Shape[2];

        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);

        // Runtime polymorphism
        for (Shape s : shapes) {
            s.displayArea();
        }
    }
}