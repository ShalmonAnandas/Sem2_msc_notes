package practical3;

import java.util.Scanner;

public class mul_table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which multiplication table do you want: ");
        int multiplicand = scan.nextInt();
        for (int multiplier = 0; multiplier <= 10; multiplier++) {
            System.out.println(multiplicand + " x " + multiplier + " = " + (multiplicand * multiplier));
        }
    }
}
