/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprog;
// Sum of natural numbers
import java.util.Scanner;

/**
 *
 * @author shalmon
 */
public class sum_of_natural_numbers{
    public static void main(String[] args){  
        int i, num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N : ");
        num = sc.nextInt();
        System.out.print("The first " + num + " natural numbers are ");
        for(i = 1; i <= num; ++i)  
            {     
                System.out.print(i + " ");
                sum = sum + i;
            }  
        System.out.println(" ");
        System.out.println("Sum of First 10 Natural Numbers is = " + sum);  
    }  
}
