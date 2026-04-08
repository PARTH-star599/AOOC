import java.util.Scanner;

class Stack {
    int top;
    int max = 5;
    int[] arr = new int[max];

    Stack() {
        top = -1;
    }

    void push(int data) {
        if (top == max - 1) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = data;
            System.out.println(data + " pushed into stack");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(arr[top--] + " popped from stack");
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack Elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}

public class StackDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        int choice, value;

        do {
            System.out.println("\n1.Push\n2.Pop\n3.Display\n4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    s.push(value);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}