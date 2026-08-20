package Module2.shapes;

public class ShapesMain {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Circle:");
        System.out.println("  Area: " + circle.area());
        System.out.println("  Perimeter: " + circle.perimeter());

        System.out.println("Rectangle:");
        System.out.println("  Area: " + rectangle.area());
        System.out.println("  Perimeter: " + rectangle.perimeter());
    }
}
