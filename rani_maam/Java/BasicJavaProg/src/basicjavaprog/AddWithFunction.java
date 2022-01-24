/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprog;

import java.util.*;

/**
 *
 * @author nasha
 */
public class AddWithFunction {
    int a,b,c;
    public void add(){
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        c = a+b;
        
        System.out.println("Addition of the two numbers is " + c);
    }
    
    public static void main(String[] args){
        AddWithFunction a1 = new AddWithFunction();
        a1.add();
    }
}
