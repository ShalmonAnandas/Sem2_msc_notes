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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Unit2_Q13 implements ActionListener{
    
    public Unit2_Q13(){
        //creating frame
        JFrame f = new JFrame();
        
        //creating elements
        JLabel label1 = new JLabel("Enter the first no: ");
        label1.setBounds(50,50,100,20);
        JTextField tf1 = new JTextField();
        tf1.setBounds(200,50,100,20);
        JLabel label2 = new JLabel("Enter the Second no: ");
        label2.setBounds(50,100,150,20);
        JTextField tf2 = new JTextField();
        tf2.setBounds(200,100,100,20);
        JLabel label3 = new JLabel("The sum is: ");
        label3.setBounds(50,150,150,20);
        JLabel label4 = new JLabel("");
        label4.setBounds(200,150,150,20);
        JButton b1 = new JButton("ADD");
        b1.setBounds(50, 200, 125, 20);
        JButton b2 = new JButton("CLEAR");
        b2.setBounds(200, 200, 125, 20);
        
        //adding elemts to the frame
        f.add(label1);
        f.add(tf1);
        f.add(label2);
        f.add(tf2);
        f.add(label3);
        f.add(label4);
        f.add(b1);
        f.add(b2);
        
        //settings of the frame
        f.setSize(400,350);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    
    
    public static void main(String[] args){
        Unit2_Q13 u = new Unit2_Q13();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf1.setText("gamer");
    }

}
