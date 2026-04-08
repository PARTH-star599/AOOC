import java.util.Scanner;

// Abstract Class
abstract class Shape {

    protected double dim1;
    protected double dim2;

    // Constructor
    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    // Abstract Method
    abstract double area();
}

// Rectangle Class
class Rectangle extends Shape {

    public Rectangle(double length, double breadth) {
        super(length, breadth);
    }

    @Override
    double area() {
        return dim1 * dim2;
    }
}

// Triangle Class
class Triangle extends Shape {

    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    double area() {
        return 0.5 * dim1 * dim2;
    }
}

// Test Class
public class ShapeTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and breadth of Rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        System.out.print("Enter base and height of Triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        Shape rect = new Rectangle(length, breadth);
        Shape tri = new Triangle(base, height);

        System.out.println("\nArea of Rectangle: " + rect.area());
        System.out.println("Area of Triangle: " + tri.area());

        sc.close();
    }
}