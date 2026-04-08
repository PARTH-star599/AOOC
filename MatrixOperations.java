import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] result = new int[2][2];

        System.out.println("Enter elements of Matrix A:");
        for(int i = 0; i < 2; i++)
            for(int j = 0; j < 2; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter elements of Matrix B:");
        for(int i = 0; i < 2; i++)
            for(int j = 0; j < 2; j++)
                B[i][j] = sc.nextInt();

        System.out.println("\nChoose Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Transpose of Matrix A");

        int choice = sc.nextInt();

        switch(choice) {

            case 1:
                for(int i = 0; i < 2; i++)
                    for(int j = 0; j < 2; j++)
                        result[i][j] = A[i][j] + B[i][j];

                System.out.println("Addition Result:");
                break;

            case 2:
                for(int i = 0; i < 2; i++) {
                    for(int j = 0; j < 2; j++) {
                        result[i][j] = 0;
                        for(int k = 0; k < 2; k++)
                            result[i][j] += A[i][k] * B[k][j];
                    }
                }

                System.out.println("Multiplication Result:");
                break;

            case 3:
                System.out.println("Transpose of Matrix A:");
                for(int i = 0; i < 2; i++) {
                    for(int j = 0; j < 2; j++) {
                        System.out.print(A[j][i] + " ");
                    }
                    System.out.println();
                }
                sc.close();
                return;

            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;
        }

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}