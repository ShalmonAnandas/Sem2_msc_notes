/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applet;

import java.applet.*;
import java.awt.*;

/**
 *
 * @author nasha
 */
public class smiley extends Applet{

    /**
     * @param args the command line arguments
     */
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(80, 80, 150, 150);
        
        g.setColor(Color.BLACK);
        g.fillOval(110, 120, 30, 40);
        g.fillOval(170, 120, 30, 40);
        
        g.drawLine(155, 160, 155, 180);
        
        g.setColor(Color.RED);
        g.fillRect(130, 200, 50, 15);
    }
    
}
