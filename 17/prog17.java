// 17) Create a package to implement addition, subtraction, multiplication and division.
// Use a menu driven program after receiving two numbers from the user.

//--------------------------------mathPack[Folder]--------------------------------------//
// FILE 1 Operations.java :
package mathpack;

public class Operations {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

//FILE 2 Main.java :
import java.util.Scanner;
import mathpack.Operations;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Operations op = new Operations();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("\n1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1: System.out.println("Result = " + op.add(a, b)); break;
            case 2: System.out.println("Result = " + op.sub(a, b)); break;
            case 3: System.out.println("Result = " + op.mul(a, b)); break;
            case 4: System.out.println("Result = " + op.div(a, b)); break;
            default: System.out.println("Invalid choice");
        }
    }
}
