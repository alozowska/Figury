public class ShapeCalculator {

    double squareArea;
    double circleArea;
    double trianglePerimeter;
    double rectPerimeter;

    double squareArea(Square square) {
        return squareArea= square.a * square.a;
    }

    double circleArea(Circle circle) {
        return circle.circleArea = 3.14 * circle.r * circle.r;
    }

    double trianglePerimeter(Triangle triangle) {
        return triangle.trianglePerimeter = triangle.a + triangle.b + triangle.c;
    }

    double rectPerimeter(Rectangle rectangle) {
        return rectangle.rectPerimeter = 2 * rectangle.a + 2 * rectangle.b;
    }
}
