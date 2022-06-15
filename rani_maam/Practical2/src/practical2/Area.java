/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical2;

public class Area {
    void calarea(int a){
        int area = a*a;
        System.out.println("Area of Square is: " + area);
    }
    
    void calarea(int a, int b){
        int area = a*b;
        System.out.println("Area of Rectangle is: " + area);
    }
    
    public static void main(String[] args){
        Area a1 = new Area();
        a1.calarea(5);
        a1.calarea(4, 5);
    }
}
