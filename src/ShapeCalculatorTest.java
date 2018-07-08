public class ShapeCalculatorTest {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10,5);
        Square square1 = new Square(15);
        Triangle triangle1 = new Triangle(5, 8, 10);
        Circle circle1 = new Circle(8);
        ShapeCalculator shape = new ShapeCalculator();

        System.out.println("Rectangle values: ");
        System.out.println(shape.rectPerimeter(rect1));

        System.out.println("Square values:");
        System.out.println(shape.squareArea(square1));

        System.out.println("Triangle values:");
        System.out.println(shape.trianglePerimeter(triangle1));

        System.out.println("Circle values:");
        System.out.printf("%.2f",shape.circleArea(circle1));
    }
}
