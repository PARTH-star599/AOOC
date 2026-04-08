import java.util.Scanner;

// Base Class
class Employee1 {

    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee1(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.10;  // Default 10% bonus
    }

    public void generatePerformanceReport() {
        System.out.println("\nPerformance Report for " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Bonus: ₹" + calculateBonus());
    }

    public void manageProject() {
        System.out.println(name + " is managing a general project.");
    }
}

// Manager Class
class Manager extends Employee1 {

    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20;  // 20% bonus
    }

    @Override
    public void manageProject() {
        System.out.println(name + " is managing multiple teams and projects.");
    }
}

// Developer Class
class Developer extends Employee1 {

    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15;  // 15% bonus
    }

    @Override
    public void manageProject() {
        System.out.println(name + " is developing software modules.");
    }
}

// Programmer Class
class Programmer extends Employee1 {

    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.12;  // 12% bonus
    }

    @Override
    public void manageProject() {
        System.out.println(name + " is writing and testing code.");
    }
}

// Test Class
public class CompanyTest {

    public static void main(String[]