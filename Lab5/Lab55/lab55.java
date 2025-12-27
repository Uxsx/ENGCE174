import java.util.Scanner;

class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public double calculateArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    protected double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14159 * radius * radius;
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class lab55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Circle radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter Rectangle width: ");
        double w = sc.nextDouble();
        System.out.print("Enter Rectangle height: ");
        double h = sc.nextDouble();

        Circle circle = new Circle("Circle", r);
        Rectangle rect = new Rectangle("Rectangle", w, h);

        Shape[] shapes = {circle, rect};

        for (Shape s : shapes) {
            System.out.println("Shape: " + s.name + " | Area: " + s.calculateArea());
        }

        sc.close();
    }
}
