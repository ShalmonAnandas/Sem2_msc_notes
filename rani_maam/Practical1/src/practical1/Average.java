/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical1;
import java.util.Scanner;
/**
 *
 * @author nasha
 */
public class Average {
    public void calculate(int a, int b, int c){
        int avg = (a + b + c ) / 3;
        System.out.println("The average of entered numbers is:" + avg);
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scan.nextInt();
        scan.close();
        
        Average a1=new Average();
        a1.calculate(num1,num2,num3);
    }
}
