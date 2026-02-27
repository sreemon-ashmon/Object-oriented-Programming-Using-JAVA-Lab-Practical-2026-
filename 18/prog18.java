// Q) Create a class Student with rollno, name, age and course.
// If age is not between 15 and 21 → AgeNotWithinRangeException.
// If name contains numbers or special symbols → NameNotValidException.
// Define two exception classes.

import java.util.Scanner;

class AgeNotWithinRangeException extends Exception {
    AgeNotWithinRangeException(String msg) {
        super(msg);
    }
}
class NameNotValidException extends Exception {
    NameNotValidException(String msg) {
        super(msg);
    }
}

class Student {
    int rollno;
    String name;
    int age;
    String course;

    Student(int r, String n, int a, String c)
            throws AgeNotWithinRangeException, NameNotValidException {

        if (a < 15 || a > 21) {
            throw new AgeNotWithinRangeException("Age not between 15 and 21");
        }

        if (!n.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException("Name contains invalid characters");
        }

        rollno = r;
        name = n;
        age = a;
        course = c;
    }

    void display() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter roll no: ");
            int r = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: ");
            String n = sc.nextLine();

            System.out.print("Enter age: ");
            int a = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter course: ");
            String c = sc.nextLine();

            Student s = new Student(r, n, a, c);
            s.display();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
