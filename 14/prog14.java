// Q) Write a Java program to sort N names ignoring case.
import java.util.Scanner;
import java.util.Arrays;

public class SortNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            names[i] = sc.nextLine();
        }

        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);

        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
