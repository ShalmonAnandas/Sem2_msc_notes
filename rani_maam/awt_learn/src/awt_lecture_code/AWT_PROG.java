/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt_lecture_code;
import java.awt.*;
/**
 *
 * @author nasha
 */
public class AWT_PROG extends Frame{
    AWT_PROG(){
        FlowLayout f1 = new FlowLayout();
        setLayout(f1);
        
        Checkbox cb1 = new Checkbox("C++");
        Checkbox cb2 = new Checkbox("C");
        
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox cb3 = new Checkbox("Python", cbg, false);
        Checkbox cb4 = new Checkbox("R", cbg, true);
        
        add(cb1);
        add(cb2);
        add(cb3);
        add(cb4);
        
        setSize(400,400);
        setVisible(true);
    }
    
    public static void main(String[] args){
        AWT_PROG a1 = new AWT_PROG();
    }
}
