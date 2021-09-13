package Task1September;

public class ShapeTester {

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.calculateArea(10);
        circle.calculatePerimeter(2);

        System.out.println(circle.calculateArea(10));

        System.out.println(circle.calculatePerimeter(2));

        Shape shape = new Square();
        shape.calculateArea(4);
        shape.calculatePerimeter(2);
        System.out.println(shape.calculateArea(4));
        System.out.println(shape.calculatePerimeter(2));

    }
}


