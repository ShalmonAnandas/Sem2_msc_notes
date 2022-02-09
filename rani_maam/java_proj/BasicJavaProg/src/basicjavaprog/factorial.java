/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprog;
//Check if number is even or odd
import java.util.*;

/**
 *
 * @author shalmon
 */
public class factorial {
    public static void main(String[] args){
        int i, num, fac = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want a factorial of : ");
        num = sc.nextInt();
        for(i=1; i<=num; i++)
        {
            System.out.print(i + " x ");
            fac = i * fac;
        }
        System.out.println("The factorial is " + fac);
    }
}