interface Shape {
    void getArea(double a, double b);
}

class Rectangle implements Shape {
    @Override
    public void getArea(double l, double b) {
        double area = l * b;
        System.out.println("Area of rectangle: " + area);
    }
}

class Circle implements Shape {
    @Override
    public void getArea(double pi, double r) {
        double area = pi * r * r;
        System.out.println("Area of circle: " + area);
    }
}

class Triangle implements Shape {
    @Override
    public void getArea(double b, double h) {
        double area = 0.5 * h * b;
        System.out.println("Area of triangle: " + area);
    }
}

public class Area {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.getArea(2, 3);

        Circle circle = new Circle();
        circle.getArea(3.14,5);

        Triangle triangle = new Triangle();
        triangle.getArea(5, 6);
    }
}
