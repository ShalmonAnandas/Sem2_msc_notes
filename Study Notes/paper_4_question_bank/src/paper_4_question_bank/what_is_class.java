/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paper_4_question_bank;

/**
 *
 * @author shalmon
 */

class Base{
    void print(){
        System.out.println("Class printed");
    }
}

public class what_is_class extends Base{
    public static void main(String[] args){
        Base b = new Base();
        b.print();
    }
}
