package paper_4_question_bank;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shalmon
 */
public class Unit2_Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //Askes for number input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        //temp to check if the number is a palindrome later
        int temp = num;
        
        //Declares vairable for reverse of input
        int rev = 0;
        
        //example number will be 25
        //while loop to reverse number
        while(num!=0){
            
            //takes remainder when number is divided by 10
            int rem = num % 10;
            //rem will be 5
            
            //reverse is assigned the number of initial reverse multiplied by 10 + remainder
            rev = rev * 10 + rem;
            //rev will be 5
            
            num = num/10;
            //num will be set to 2
        }
        if(temp == rev){
            System.out.println("Number is a palindrome");
        }else{
            System.out.println("Number is not a palindrome");
        }
    }
}
