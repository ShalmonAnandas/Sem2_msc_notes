package practical3;

import java.util.Scanner;

public class sum_of_all {
    public static void main(String[] args) {
        // take input for array
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scan.nextInt();
        }

        // calculate sum
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + arr[i];
        }

        // print sum
        System.out.println("Sum of all the entered number is " + sum);
    }
}
