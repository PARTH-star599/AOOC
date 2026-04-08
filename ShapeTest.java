import java.util.Scanner;

// Interface
interface Shape {
    double area();   // abstract method
}

// Rectangle Class
class Rectangle implements Shape {

    double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }
}

// Triangle Class
class Triangle implements Shape {

    double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * base * height;
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