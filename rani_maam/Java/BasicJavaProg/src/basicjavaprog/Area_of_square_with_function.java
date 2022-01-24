/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprog;

/**
 *
 * @author nasha
 */
public class Area_of_square_with_function {
    int side, area;
    public void sqarea(){
        side = 10;
        area = side * side;
        System.out.println("Area of the square is " + area);
    }
    
    public static void main(String[] args){
        Area_of_square_with_function a1 = new Area_of_square_with_function();
        a1.sqarea();
    }
}
