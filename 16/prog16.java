// Q) Write a Java program to create a package and access it from another class.

//--------------------------------mypack[Folder]--------------------------------------//
// FILE 1 :
package mypack;

public class Message {
    public void show() {
        System.out.println("Hello from package!");
    }
}

//FILE 2 :
import mypack.Message;

public class Main {
    public static void main(String[] args) {
        Message m = new Message();
        m.show();
    }
}
