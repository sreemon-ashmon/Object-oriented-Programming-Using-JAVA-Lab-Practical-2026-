// Q) Create an abstract class called Figure which contains three data members length, breadth, height and an abstract method to find the area. 
// Figure class also contains concrete method to read the data members and display them. 
// Derive two classes Rectangle and Triangle from Figure and override area() to find the area of rectangle and triangle.
import java.util.Scanner;
abstract class Figure {
    double length, breadth, height;
    void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }
    void display() {
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Height = " + height);
    }
    abstract void area();
}
class Rectangle extends Figure {
    void area() {
        double area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }
}
class Triangle extends Figure {
    void area() {
        double area = 0.5 * breadth * height;
        System.out.println("Area of Triangle = " + area);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Rectangle:");
        Rectangle r = new Rectangle();
        r.readData();
        r.display();
        r.area();
        System.out.println("\nTriangle:");
        Triangle t = new Triangle();
        t.readData();
        t.display();
        t.area();
    }
}
