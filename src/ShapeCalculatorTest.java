public class ShapeCalculatorTest {

    double squareArea(Square square) {
        return Math.pow(square.getA(), 2);
    }
    double rectPerimeter(Rectangle rectangle) {
        return 2 * (rectangle.getA() + rectangle.getB());
    }
    double trianglePerimeter(Triangle triangle) {
        return triangle.getA() + triangle.getB() + triangle.getC();
    }
    double circleArea(Circle cirle) {
        return Math.PI * Math.pow(cirle.getR(), 2);
    }
}