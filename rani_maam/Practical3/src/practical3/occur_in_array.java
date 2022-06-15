package practical3;

import java.util.Scanner;

public class occur_in_array {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4, 5, 2, 2, 3, 7, 6, 5, 4, 4, 3, 2, 2, 1, 1, 4, 5, 3, 8, 8, 9, 6, 7, 2 };
        int arr_len = arr.length;
        Scanner scan = new Scanner(System.in);
        System.out.println("Which number do you want to count: ");
        int arr_find = scan.nextInt();

        int count = 0;
        for (int i = 0; i < arr_len; i++)
            if (arr_find == arr[i])
                count++;

        System.out.println("The number occurs " + count + " times");
    }
}
