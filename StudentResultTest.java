        import java.util.Scanner;

// Base Class
class Student {
    protected int rollNo;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }
}

// Derived Class
class Test extends Student {
    protected int sub1, sub2;

    public void setMarks(int sub1, int sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public void getMarks() {
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
    }
}

// Interface
interface Sports {
    int sMarks = 0;   // default public static final
    void setSportsMarks(int sMarks);
}

// Final Derived Class
class Result extends Test implements Sports {

    private int sportsMarks;

    public void setSportsMarks(int sMarks) {
        this.sportsMarks = sMarks;
    }

    public void displayResult() {
        int total = sub1 + sub2 + sportsMarks;

        System.out.println("\n----- Result -----");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("Sports Marks: " + sportsMarks);
        System.out.println("Total Marks: " + total);
    }
}

// Test Application
public class StudentResultTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Result r = new Result();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        r.setRollNo(roll);

        System.out.print("Enter Marks of Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        int m2 = sc.nextInt();
        r.setMarks(m1, m2);

        System.out.print("Enter Sports Marks: ");
        int sm = sc.nextInt();
        r.setSportsMarks(sm);

        r.displayResult();

        sc.close();
    }
}