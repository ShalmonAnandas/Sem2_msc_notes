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

class Peri_Square extends Perimeter{
    public void Peri_Square(){
        int a = 5;
        int peri = a * 4;
        System.out.println("Perimeter of square is " + peri);
    }
}

public class Peri_Triangle extends Peri_Square{
    public void Peri_triangle(){
        int a = 5, b = 6, c = 7;
        int peri = a+b+c;
        System.out.println("Perimeter of triangle is " + peri);
    }
    
    public static void main(String[] args){
        Peri_Triangle p1=new Peri_Triangle();
        p1.Perimeter();
        p1.Peri_Square();
        p1.Peri_triangle();
    }
}
