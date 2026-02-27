// Q) Write a Java program to find the area of Rectangle and Square using method overloading.
import java.util.Scanner;

class Area {

    double area(double length, double breadth) {
        return length * breadth;
    }

    double area(double side) {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area a = new Area();

        System.out.print("Enter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle = " + a.area(l, b));

        System.out.print("Enter side of square: ");
        double s = sc.nextDouble();
        System.out.println("Area of Square = " + a.area(s));
    }
}
