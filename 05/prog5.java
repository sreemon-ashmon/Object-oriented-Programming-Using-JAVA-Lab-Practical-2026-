// Q Write a Java program to find the biggest of three numbers received from the command line. ?

public class BiggestNumber {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Please provide exactly 3 numbers.");
            return;
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int biggest = num1;

        if (num2 > biggest) {
            biggest = num2;
        }
        if (num3 > biggest) {
            biggest = num3;
        }
        System.out.println("The biggest number is: " + biggest);
    }
}
