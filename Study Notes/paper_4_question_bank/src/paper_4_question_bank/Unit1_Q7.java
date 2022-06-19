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

public class Unit1_Q7 {
    public static void main(String[] args){
        //input number
        int num = 60;
        
        //prints output 
        System.out.print("Factors are: ");
        
        //for loop to print out all factors
        for(int i = 1; i<=num; i++){
            //if statement to find out the factors and print it
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
