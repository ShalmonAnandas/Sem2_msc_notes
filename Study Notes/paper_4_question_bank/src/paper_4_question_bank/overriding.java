/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paper_4_question_bank;

/**
 *
 * @author shalmon
 */

class Parent{
    void show(){
        System.out.println("Parent shown");
    }
}

class Child extends Parent{
    void show(){
        System.out.println("Child shown");
    }
}

public class overriding {
    public static void main(String[] args){
        Parent p1 = new Parent();
        p1.show();
        
        Parent p2 = new Child();
        p2.show();
    }
}
