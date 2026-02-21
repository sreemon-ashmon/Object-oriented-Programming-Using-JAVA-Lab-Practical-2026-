// Q Write a Java program to create a Student with data members name, city, and age, and a method printData() to display the data. 
//   Create two objects S1 and S2 to declare and access the values. ?

public class StudentDemo {
    public static void main(String[] args) {
        Student S1 = new Student();
        Student S2 = new Student();

        S1.name = "Rahul";
        S1.city = "Kochi";
        S1.age = 20;

        S2.name = "Anjali";
        S2.city = "Delhi";
        S2.age = 22;

        S1.printData();
        S2.printData();
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
