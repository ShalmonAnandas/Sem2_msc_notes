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

class Perimeter{
    
    public void Perimeter(){
        System.out.println("Perimeters will be printed: ");
    }
}

public class Peri_Square extends Perimeter{
    
    public void Peri_Square(){
        int a = 5;
        int peri_sq = a*4;
        System.out.println("Perimeter of the square is " + peri_sq);
    }
    
    public static void main(String[] args) {
        Peri_Square p1=new Peri_Square();
        p1.Perimeter();
        p1.Peri_Square();
    }
    
}
