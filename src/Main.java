import static java.lang.Math.*;
public class Main {

    public static void main(String[] args) {
        ShapeCalculatorTest shapeCalculator = new ShapeCalculatorTest();

        Square square = new Square(6);
        Rectangle rect = new Rectangle(3,7);
        Triangle triangle = new Triangle(3, 5, 9);
        Circle circle = new Circle(7);

        double squareArea = shapeCalculator.squareArea(square);
        double rectPerimeter = shapeCalculator.rectPerimeter(rect);
        double trianglePerimeter = shapeCalculator.trianglePerimeter(triangle);
        double circleArea = shapeCalculator.circleArea(circle);

        System.out.println("Pole kwadratu " + squareArea);
        System.out.println("Obwód prostokąta " + rectPerimeter);
        System.out.println("Obwód trójkąta " + trianglePerimeter);
        System.out.println("Pole koła " + circleArea);
    }
}
