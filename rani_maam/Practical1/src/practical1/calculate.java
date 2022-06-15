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
public class calculate {
    public void area()
    {
    int l,b,area;
    l = 4;
    b = 6;
    area = l * b;
    System.out.println("The area of a rectange is " + area);
    }
    
    public void peri()
    {
    int l,b,peri;
    l = 4;
    b = 6;
    peri = (2*l) + (2*b);
    System.out.println("The perimeter of a rectangle is " + peri);
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calculate c1=new calculate();
        c1.area();
        c1.peri();
    }
    
}
