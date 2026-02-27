// 18) Write a Java program to create a thread using Thread class.

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread Started");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
