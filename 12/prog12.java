// Q) Create an interface Department containing attributes deptName and deptHead. 
// It has an abstract method showData() for printing the attribute. 
// Create a class Hostelcontaining hostelname, hostellocation and noofrooms and also have methods readData() and printData() for reading and printing the details. 
// Then you need to write another class named Student extending the Hostel class and implementing the Department interface. 
// This class contains the attributes studname, regno, electivesub and avgmark and use readData() and showData() for reading and printing the details

import java.util.Scanner;
interface Department {
    String deptName = "Department X";
    String deptHead = "Mr Y";
    void showData();
}
class Hostel {
    String hostelName;
    String hostelLocation;
    int noOfRooms;
    void readData(Scanner sc) {
        System.out.print("Enter Hostel Name: ");
        hostelName = sc.nextLine();
        System.out.print("Enter Hostel Location: ");
        hostelLocation = sc.nextLine();
        System.out.print("Enter Number of Rooms: ");
        noOfRooms = sc.nextInt();
        sc.nextLine();}
    void printData() {
        System.out.println("\nHOSTEL DETAILS---");
        System.out.println("Hostel Name      : " + hostelName);
        System.out.println("Location         : " + hostelLocation);
        System.out.println("Number of Rooms  : " + noOfRooms);}}
class Student extends Hostel implements Department {
    String studName;
    int regNo;
    String electiveSub;
    double avgMark;
    String deptName;
    String deptHead;
    void readStudentData(Scanner sc) {
        readData(sc);  
        System.out.print("Enter Student Name: ");
        studName = sc.nextLine();
        System.out.print("Enter Register Number: ");
        regNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Elective Subject: ");
        electiveSub = sc.nextLine();
        System.out.print("Enter Average Mark: ");
        avgMark = sc.nextDouble();
        sc.nextLine();
        }
    public void showData() {
        printData();  
        System.out.println("\nSTUDENT DETAILS---");
        System.out.println("Student Name     : " + studName);
        System.out.println("Register Number  : " + regNo);
        System.out.println("Elective Subject : " + electiveSub);
        System.out.println("Average Mark     : " + avgMark);
        System.out.println("\nDEPARTMENT DETAILS---");
        System.out.println("Department Name  : " + Department.deptName);
        System.out.println("Department Head  : " + Department.deptHead);}}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        s.readStudentData(sc);
        s.showData();  
        sc.close();}}
