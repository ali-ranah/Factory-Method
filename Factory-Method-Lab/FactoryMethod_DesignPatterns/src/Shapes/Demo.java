package Shapes;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        
        CircleGeometry circleGeometry = new CircleGeometry();
        SquareGeometry squareGeometry = new SquareGeometry();
        TriangleGeometry triangleGeometry = new TriangleGeometry();

        shapes.add(circleGeometry.createShape());
        shapes.add(squareGeometry.createShape());
        shapes.add(squareGeometry.createShape());
        shapes.add(triangleGeometry.createShape());

        for(Shape s : shapes) {
            s.draw();
        }
    }
}
