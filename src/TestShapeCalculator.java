public class TestShapeCalculator {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator=new ShapeCalculator();
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(2.0, 4.2);
        Circle circle = new Circle(4.9);
        Triangle triangle=new Triangle(5.5,5.5, 5.5);



        System.out.println(square.squareArea +" \n"+rectangle.rectPerimeter+ " \n"+triangle.trianglePerimeter+" \n"+rectangle.rectPerimeter);
    }
}