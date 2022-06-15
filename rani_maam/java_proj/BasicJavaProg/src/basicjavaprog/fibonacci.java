/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprog;
// Print fibonacci series
import java.util.*;
/**
 *
 * @author shalmon
 */
public class fibonacci {
    public static void main(String args[]){
        int n1=0,n2=1,n3,i,count;
        System.out.print("How many digits of the fibanacci sequence do you want to print? : ");
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        System.out.print(n1+" "+n2);
    
        for(i=2; i<count; i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}

