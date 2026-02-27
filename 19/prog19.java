// Q) Write a multithreaded program to print the multiplication table of 2 and 5 interchangeably with suitable delay.

class Table2 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 x " + i + " = " + (2 * i));
            try {
                Thread.sleep(500); 
            } catch (Exception e) {}
        }
    }
}

class Table5 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
            try {
                Thread.sleep(500); 
            } catch (Exception e) {}
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Table2 t1 = new Table2();
        Table5 t2 = new Table5();

        t1.start();
        t2.start();
    }
}
