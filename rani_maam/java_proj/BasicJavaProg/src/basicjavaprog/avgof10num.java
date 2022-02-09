/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprog;
// Write a program to calculate an average of 10 numbers
import java.util.*;
/**
 *
 * @author shalmon
 */
public class avgof10num {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n[] = new int[10];
        int sum = 0, avg, i;
        System.out.println("Enter 10 numbers seperated by <space> : ");
        for(i=0;i<10;i++)
            n[i] = sc.nextInt();
        for(i=0;i<10;i++)
            sum = sum + n[i];
        avg = sum / 10;
        System.out.println("Average of the numbers is " + avg);
    }        
}
