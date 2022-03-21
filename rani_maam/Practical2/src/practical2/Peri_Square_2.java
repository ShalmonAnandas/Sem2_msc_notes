/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical2;

class Perimeter_2{
    public void Perimeter_2(){
        System.out.println("Perimeters will be printed: ");
    }
}

class Peri_Triangle_2 extends Perimeter_2{
    public void Peri_Triangle_2(){
        int a = 5, b = 5, c = 6;
        int peri_tri = a + b + c;
        System.out.println("Perimeter of the triangle is " + peri_tri);
    }
}

public class Peri_Square_2 extends Peri_Triangle_2 {
    public void Peri_Square_2(){
        int a = 5;
        int peri_sq = a*4;
        System.out.println("Perimeter of the square is " + peri_sq);
    }
    
    public static void main(String[] args){
        Peri_Square_2 p1 = new Peri_Square_2();
        p1.Perimeter_2();
        p1.Peri_Triangle_2();
        p1.Peri_Square_2();
    }
}
