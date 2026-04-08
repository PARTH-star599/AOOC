import java.util.Scanner;

// Interface
interface Stack {

    int size = 5;  // default public static final

    void push(int data);
    void pop();
    void display();
    void overflow();
    void underflow();
}

// Implementing Class
class IntegerStack implements Stack {

    int[] arr = new int[size];
    int top = -1;

    // Push Operation
    public void push(int data) {
        if (top == size - 1) {
            overflow();
        } else {
            arr[++top] = data;
            System.out.println(data + " pushed into stack");
        }
    }

    // Pop Operation
    public void pop() {
        if (top == -1) {
            underflow();
        } else {
            System.out.println(arr[top--] + " popped from stack");
        }
    }

    // Display Stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack Elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    // Overflow Method
    public void overflow() {
        System.out.println("Stack Overflow! Cannot push element.");
    }

    // Underflow Method
    public void underflow() {
        System.out.println("Stack Underflow! Cannot pop element.");
    }
}

// Test Class
public class StackTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        IntegerStack stack = new IntegerStack();
        int choice, value;

        do {
            System.out.println("\n1.Push\n2.Pop\n3.Display\n4.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value to push: ");
                    value = sc.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}