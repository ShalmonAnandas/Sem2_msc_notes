/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

/**
 *
 * @author nasha
 */
public class Exceptionhandling {

    public static void main(String[] args) {
        int a, b, c;
        a = 10;
        b = 0;
        try{
            c = a/b;
            System.out.println("the answer is " + c);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by 0");
            System.out.println(e);
        }
        finally{
            System.out.println("this is a finally");
        }
        c = a+b;
        System.out.println("The answer is " + c);
    }
}
