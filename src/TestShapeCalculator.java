public class TestShapeCalculator {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator=new ShapeCalculator();
        Square square = new Square(5);
        double poleKwartatu=shapeCalculator.squareArea(square);
        Rectangle rectangle = new Rectangle(2.0, 4.2);
        double obwodProstokata=shapeCalculator.rectPerimeter(rectangle);
        Circle circle = new Circle(4.9);
        double poleKola=shapeCalculator.circleArea(circle);
        Triangle triangle=new Triangle(5.5,5.5, 5.5);
        double obwodTrojkata = shapeCalculator.trianglePerimeter(triangle);



        System.out.println(poleKwartatu +" \n"+poleKola+ " \n"+obwodProstokata+" \n"+obwodTrojkata);
    }
}