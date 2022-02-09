/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprog;
// Check if number is even or odd
import java.util.*;

/**
 *
 * @author shalmon
 */
public class oddeven {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        if(n%2==0)
            System.out.print("Number is even");
        else
            System.out.println("Number is odd");
        }
}
