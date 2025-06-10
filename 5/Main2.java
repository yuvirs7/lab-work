/*Question 2:
Create a class Shape with a method display(). Override this method in both Circle and Rectangle classes. 
Use the super keyword in the overridden methods to call the parent class display() method before
 printing shape-specific messages. Write a main function to show how super works. */
class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void display() {
        super.display();
        System.out.println("This is a circle.");
    }
}

class Rectangle extends Shape {
    void display() {
        super.display();
        System.out.println("This is a rectangle.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.display();
        s2.display();
    }
}

