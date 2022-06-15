/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical2;

interface Peri_Square_4{
    default void Peri_Square_4(){
        int a = 5;
        int peri_sq = a*4;
        System.out.println("Perimeter of the square is " + peri_sq);
    }
}

interface Peri_Triangle_4{
    default void Peri_Triangle_4(){
        int a = 5, b = 5, c = 6;
        int peri_tri = a + b + c;
        System.out.println("Perimeter of the triangle is " + peri_tri);
    }
}

public class Perimeter_4 implements Peri_Square_4, Peri_Triangle_4{
    public void PeriMeter_4(){
    System.out.println("Perimeters will be printed: ");
    Peri_Square_4.super.Peri_Square_4();
    Peri_Triangle_4.super.Peri_Triangle_4();
    }
    
    public static void main(String[] args){
        Perimeter_4 p4 = new Perimeter_4();
        p4.PeriMeter_4();
    }
}
