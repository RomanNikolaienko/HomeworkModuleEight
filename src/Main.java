public class Main {
    public static void main(String[] args) {
//        Shape shapeOne = new Circle();
//        Shape shapeTwo = new Quad();
//        Shape shapeThree = new Triangle();
//        Shape shapeFour = new Trapezium();
//        Shape shapeFive = new Hexagon();
//        Shape shapeSix = new Octagon();
//        shapeOne.shapeName();
//        shapeTwo.shapeName();
//        shapeThree.shapeName();
//        shapeFour.shapeName();
//        shapeFive.shapeName();
//        shapeSix.shapeName();

        Shape[] shapes = {new Circle(), new Quad(), new Triangle(), new Trapezium(), new Hexagon(), new Octagon()};
        for (Shape shape : shapes) {
            shape.shapeName();
        }
    }
}
