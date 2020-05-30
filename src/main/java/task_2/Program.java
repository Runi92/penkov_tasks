package task_2;

import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter m:");

        int m = scanner.nextInt();
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        int array[][] = new int[m][n];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int number = getNumber();
                array[i][j] = number;
                System.out.println(number);
            }
        }
    }

    private static int getNumber() {
        int i = new Random().nextInt();
        if (i % 2 != 0) {
            return i;
        } else return getNumber();
    }

}