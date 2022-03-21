/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical2;

class Perimeter_3{
    public void Perimeter_3(){
        System.out.println("Perimeters will be printed: ");
    }
}

class Peri_Triangle_3 extends Perimeter_3{
    public void Peri_Triangle_3(){
        int a = 5, b = 5, c = 6;
        int peri_tri = a + b + c;
        System.out.println("Perimeter of the triangle is " + peri_tri);
    }
}

public class Peri_Square_3 extends Perimeter_3 {
    public void Peri_Square_3(){
        int a = 5;
        int peri_sq = a*4;
        System.out.println("Perimeter of the square is " + peri_sq);
    }
    
    public static void main(String[] args){
        Peri_Square_3 ps3 = new Peri_Square_3();
        Peri_Triangle_3 pt3 = new Peri_Triangle_3();
        
        ps3.Perimeter_3();
        ps3.Peri_Square_3();
        
        pt3.Perimeter_3();
        pt3.Peri_Triangle_3();
    }
}
