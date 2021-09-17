package shapes;

public class shapetester {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(22,32,40,44);
        System.out.println(triangle1.area() + " | - Triangle Area |" + triangle1.perimeter() + " | - Triangle Perimeter | ");

        square square1 = new square(5);
        System.out.println(square1.calcArea() + " | - Square Area | " + square1.calcPerimeter() + " | - Square Perimeter |");





    }
}
