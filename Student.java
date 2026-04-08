// Parent class
class Student {
    int roll_no;

    void getRollNo(int r) {
        roll_no = r;
    }

    void putRollNo() {
        System.out.println("Roll Number: " + roll_no);
    }
}

// Child class of Student
class Test extends Student {
    int sub1, sub2;

    void getMarks(int m1, int m2) {
        sub1 = m1;
        sub2 = m2;
    }

    void putMarks() {
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
    }
}

// Child class of Test (Multilevel Inheritance)
class Result extends Test {

    void displayResult() {
        int total = sub1 + sub2;
        double percentage = total / 2.0;

        putRollNo();
        putMarks();
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Result obj = new Result();

        obj.getRollNo(101);
        obj.getMarks(85, 90);
        obj.displayResult();
    }
}