/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprog;
// print square of each number up to 128
/**
 *
 * @author nasha
 */

public class printsquares {
    public static void main(String[] args){
        int sum = 1;
        while(sum <= 128){
            System.out.print(sum + " ");
            sum = sum + sum;
        }
    }
}
