/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprog;
// Generate divisors of an integer
import java.util.*;

/**
 *
 * @author shalmon
 */
public class divisors {
    public static void main (String[] args){
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        System.out.print("The divisors are : ");
        for(i = 1; i <=n; i++)
            if(n%i==0)
                System.out.print(i + " ");
    }
}
