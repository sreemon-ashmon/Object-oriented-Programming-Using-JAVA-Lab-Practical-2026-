// Q Write a Java Program to add two numbers using scanner class and Buffer Reader Class ?

import java.util.*;
import java.io.*;

public class AddTwoNumbers {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int sNum1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int sNum2 = sc.nextInt();
        int sSum = sNum1 + sNum2;
        System.out.println("Sum (Scanner) = " + sSum);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number: ");
        int bNum1 = Integer.parseInt(br.readLine());
        System.out.print("Enter second number: ");
        int bNum2 = Integer.parseInt(br.readLine());
        int bSum = bNum1 + bNum2;
        System.out.println("Sum (BufferedReader) = " + bSum);
    }
}
