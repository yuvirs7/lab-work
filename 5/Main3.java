/*Question 3:
Create a class Shape with a method area().
 Derive Circle and Rectangle classes from Shape and override the area() method. 
 In the main function, use a Shape reference to point to Circle and Rectangle objects and call the area() method. 
Demonstrate how dynamic binding works by observing which area() method gets called at runtime. */
class Shape {
    void area() {
        System.out.println("Calculating area in Shape.");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Calculating area of Circle.");
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Calculating area of Rectangle.");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Shape shape;

        shape = new Circle();   
        shape.area();            

        shape = new Rectangle();  
        shape.area();       
    }
}

