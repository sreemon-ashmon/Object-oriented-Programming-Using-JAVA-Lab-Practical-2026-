// Q Write a Java program to find the sum of N integers received from the command line and find the average of those numbers. ?

public class SumAndAverage {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide at least one number.");
            return;
        }

        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }

        double average = (double) sum / args.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
