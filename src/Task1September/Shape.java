package Task1September;

public interface Shape {

    //Create  an  Interface  'Shape'  with  undefined methods as calculateArea and calculatePerimiter.
    // Create  2  classes
    // Circle  & Square that implements functionality defined in the Shape Interface.
    // Test your code.

    int r = 0;


    double calculateArea(int r);

    double calculatePerimeter(int r);


}

class Circle implements Shape {


    @Override
    public double calculateArea(int radius) {

        return Math.PI * (radius * radius);
    }

    @Override
    public double calculatePerimeter(int r) {
        return 2 * Math.PI * r;

    }
}

class Square implements Shape {

    @Override
    public double calculateArea(int r) {
        return r * r;
    }

    @Override
    public double calculatePerimeter(int r) {
        return 4 * r;
    }
}




