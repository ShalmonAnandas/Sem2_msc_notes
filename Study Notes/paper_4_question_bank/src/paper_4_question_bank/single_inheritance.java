/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paper_4_question_bank;

/**
 *
 * @author shalmon
 */

class Employee{
    float salary = 40000;
}

public class single_inheritance extends Employee{
    
    int bonus = 10000;
    
    public static void main(String[] args){
        single_inheritance sp = new single_inheritance();
        System.out.println("Pprogramminig salary is: "+ sp.salary);
        System.out.println("Bonus is: "+ sp.bonus);
    }
}
