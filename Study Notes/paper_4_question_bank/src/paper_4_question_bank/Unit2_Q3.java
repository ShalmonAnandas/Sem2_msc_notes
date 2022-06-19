/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paper_4_question_bank;

/**
 *
 * @author Shalmon
 */
import java.util.*;

public class Unit2_Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //take input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        //for loop to print multiplication table
        for(int i=1; i<=10; i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
