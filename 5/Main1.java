/*Question 1:
Create an abstract class Shape with a method area().
 Derive Circle and Rectangle from it and override the method.
  Write a main function to compute the area of both.
 */
abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius = 5;

    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle extends Shape {
    double length = 4, width = 6;

    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        circle.area();
        rectangle.area();
    }
}
