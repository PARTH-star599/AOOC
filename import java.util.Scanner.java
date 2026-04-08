import java.util.Scanner;

public classimport java.util.Scanner;

public class SortNames {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];
        String temp;

        System.out.println("Enter 10 names:");
        for (int i = 0; i < 10; i++) {
            names[i] = sc.nextLine();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (names[j].compareToIgnoreCase(names[j + 1]) > 0) {
                    temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        System.out.println("\nNames in Alphabetical Order:");
        for (int i = 0; i < 10; i++) {
            System.out.println(names[i]);
        }

        sc.close();
    }
} {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];
        String temp;

        System.out.println("Enter 10 names:");
        for (int i = 0; i < 10; i++) {
            names[i] = sc.nextLine();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (names[j].compareToIgnoreCase(names[j + 1]) > 0) {
                    temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        System.out.println("\nNames in Alphabetical Order:");
        for (int i = 0; i < 10; i++) {
            System.out.println(names[i]);
        }

        sc.close();
    }
}