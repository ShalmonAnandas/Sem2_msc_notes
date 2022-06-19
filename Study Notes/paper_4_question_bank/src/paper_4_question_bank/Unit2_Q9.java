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

//defining first interface
interface base1 {
    default void base1(){
        System.out.println("Base1 interface printed");
    }
}

//defining second interface
interface base2 {
    default void base2(){
        System.out.println("Base2 interface printed");
    }
}

//main class with both interfaces implemented
public class Unit2_Q9 implements base1, base2{
    
    //method involving both interfaces
    public void imp(){
        //calling constructors from both interfaces
        base1.super.base1();
        base2.super.base2();
    }
    
    //main method
    public static void main(String[] args){
        //calling main class as object i
        Unit2_Q9 i = new Unit2_Q9();
        //calling method from the class
        i.imp();
    }
}
