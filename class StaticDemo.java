class class StaticDemo {

    static String collegeName;
    static int studentCount;

    static {
        collegeName = "RIT Engineering College";
        studentCount = 0;
        System.out.println("Static Block Executed");
        System.out.println("College Name Initialized\n");
    }

    String studentName;

    StaticDemo(String name) {
        studentName = name;
        studentCount++;   
    }

    static void displayCollegeInfo() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Total Students: " + studentCount);
    }

    void displayStudent() {
        System.out.println("Student Name: " + studentName);
    }

    public static void main(String[] args) {

        StaticDemo.displayCollegeInfo();

        System.out.println("\nCreating Students...\n");

        StaticDemo s1 = new StaticDemo("Parth");
        StaticDemo s2 = new StaticDemo("Rahul");

        s1.displayStudent();
        s2.displayStudent();

        System.out.println();
        StaticDemo.displayCollegeInfo();
    }
} {

    static String collegeName;
    static int studentCount;

    static {
        collegeName = "RIT Engineering College";
        studentCount = 0;
        System.out.println("Static Block Executed");
        System.out.println("College Name Initialized\n");
    }

    String studentName;

    StaticDemo(String name) {
        studentName = name;
        studentCount++;   
    }

    static void displayCollegeInfo() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Total Students: " + studentCount);
    }

    void displayStudent() {
        System.out.println("Student Name: " + studentName);
    }

    public static void main(String[] args) {

        StaticDemo.displayCollegeInfo();

        System.out.println("\nCreating Students...\n");

        StaticDemo s1 = new StaticDemo("Parth");
        StaticDemo s2 = new StaticDemo("Rahul");

        s1.displayStudent();
        s2.displayStudent();

        System.out.println();
        StaticDemo.displayCollegeInfo();
    }
}