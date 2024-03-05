import java.util.Scanner;

// Abstract class GeometricShape
abstract class geometricShape {
    // Abstract method to calculate area
    abstract double area();

    // Abstract method to calculate perimeter
    abstract double perimeter();
}

// Subclass Triangle
class Triangle extends geometricShape {
    // Triangle properties
    private double side1;
    private double side2;
    private double side3;

    // Constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Implementation of abstract method for area calculation
    @Override
    double area() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Implementation of abstract method for perimeter calculation
    @Override
    double perimeter() {
        return side1 + side2 + side3;
    }
}

// Subclass Square
class Square extends geometricShape {
    // Square property
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Implementation of abstract method for area calculation
    @Override
    double area() {
        return side * side;
    }

    // Implementation of abstract method for perimeter calculation
    @Override
    double perimeter() {
        return 4 * side;
    }
}

// Main class for testing
public class geometricShapes{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Triangle
        System.out.print("Enter the length of side 1 of the triangle: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the length of side 2 of the triangle: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the length of side 3 of the triangle: ");
        double side3 = scanner.nextDouble();

        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());

        // Input for Square
        System.out.print("Enter the length of the side of the square: ");
        double squareSide = scanner.nextDouble();

        Square square = new Square(squareSide);
        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());

        // Close the scanner
        scanner.close();
    }
}

