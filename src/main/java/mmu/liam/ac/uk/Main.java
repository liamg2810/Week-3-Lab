package mmu.liam.ac.uk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Please enter the number you would like to see the times tables for:\n");

        var scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print("Please enter a valid number.\n");
        }

        var number = scanner.nextInt();
        scanner.nextLine();
        scanner.close();

        outputTimesTables(number);
    }

    private static void outputTimesTables(int number) {
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%d * %d = %d\n", number, i, number * i);
        }
    }
}
