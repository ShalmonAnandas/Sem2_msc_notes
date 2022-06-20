package paper_4_question_bank;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shalmon
 */
public class Unit2_Q8 {
    //method to calculate area of square
    void calarea(int s){
        int area = s^2;
        System.out.println("Area of Square is "+ area);
    }
    //method to calculate area of triangle
    void calarea(int b, int h){
        int area = (b*h)/2;
        System.out.println("Area of Triangle is "+ area);
    }
    //main method
    public static void main(String[] args){
        //calling class as an object
        Unit2_Q8 Area =  new Unit2_Q8();
        //calling first method (area of square)
        Area.calarea(5);
        //calling second method (area of triangle)
        Area.calarea(5, 6);
    }
}
