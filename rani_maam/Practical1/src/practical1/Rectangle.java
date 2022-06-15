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
public class Rectangle{
    public void Area(int length, int breadth){
        int a;
        a = length * breadth;
        System.out.println("The area of the rectangle is " + a);
    }
    
    public static void main(String[] args){
        Rectangle a1=new Rectangle();
        a1.Area(4, 5);
        a1.Area(5, 8);
    }
}
