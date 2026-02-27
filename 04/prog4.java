// Q Write a Java program to create a Student with data members name, city, and age, and a method printData() to display the data. 
//   Create two objects S1 and S2 to declare and access the values. ?

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student S1 = new Student();
        Student S2 = new Student();

        System.out.println("Enter details for Student 1");
        System.out.print("Name: ");
        S1.name = sc.nextLine();

        System.out.print("City: ");
        S1.city = sc.nextLine();

        System.out.print("Age: ");
        S1.age = sc.nextInt();
        

        System.out.println("\nEnter details for Student 2");
        System.out.print("Name: ");
        S2.name = sc.nextLine();

        System.out.print("City: ");
        S2.city = sc.nextLine();

        System.out.print("Age: ");
        S2.age = sc.nextInt();

        System.out.println("\nStudent Details");
        S1.printData();
        S2.printData();

        sc.close();
    }
}

class Student {
    String name;
    String city;
    int age;

    void printData() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
        System.out.println();
    }
}
