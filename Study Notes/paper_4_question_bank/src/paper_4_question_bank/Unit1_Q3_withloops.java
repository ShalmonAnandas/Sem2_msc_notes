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
public class Unit1_Q3_withloops {
    public static void main(String[] args){
        //for loop to go from 5 to 1
        //Reduces number of numbers in each line
        for(int i=5; i>0; i--){
            //for loop to go from 1 to 5
            //prints the numbers in sequence
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            //goes to next line
            System.out.println();
        }
    }
}

