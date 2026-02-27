// Q) Create an Interface department.

interface Department {
    void getDeptName();
    void getDeptHead();
}

class CSE implements Department {
    public void getDeptName() {
        System.out.println("Department: X");
    }

    public void getDeptHead() {
        System.out.println("Head: HOD");
    }
}

public class Main {
    public static void main(String[] args) {
        CSE d = new CSE();
        d.getDeptName();
        d.getDeptHead();
    }
}
