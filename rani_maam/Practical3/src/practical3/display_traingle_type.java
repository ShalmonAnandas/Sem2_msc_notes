package practical3;

import java.util.Scanner;

public class display_traingle_type {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter lengths of side of a triangle: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a == b && b == c)
            System.out.println("It is an equilateral triangle");
        else if (a == b || b == c || a == c)
            System.out.println("It is an isoceles triangle");
        else
            System.out.println("it is a scalene triangle");
    }

}
