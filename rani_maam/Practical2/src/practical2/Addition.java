/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical2;

/**
 *
 * @author nasha
 */

class Calculator{
    void add(){
        int a, b, sum;
        a = 5;
        b = 5;
        sum = a+b;
        System.out.println("Addition of two numbers is: " + sum);
    }
}

public class Addition extends Calculator {
    void add(){
        int a, b, c, sum;
        a = 5;
        b = 5;
        c = 5;
        sum = a + b + c;
        System.out.println("Addition of three numbers is: " + sum);
    }
    
    public static void main(String[] args){
        Calculator c1 = new Calculator();
        c1.add();
        c1 = new Addition();
        c1.add();
    }
}
