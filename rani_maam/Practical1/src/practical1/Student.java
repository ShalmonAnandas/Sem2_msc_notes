/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical1;

/**
 *
 * @author nasha
 */

public class Student {
    int roll_no;
    String name;
    
    public static void main(String[] args){
        Student s1=new Student();
        s1.roll_no = 2;
        s1.name = "John";
        System.out.println("Name of student is " + s1.name);
        System.out.println("Roll no of student is " + s1.roll_no);
    }
}
