/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paper_4_question_bank;

/**
 *
 * @author shalmon
 */

import javax.swing.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class unit2_q4 {
    public static void main(String[] args){
        JFrame f = new JFrame();
        
        JLabel l = new JLabel("Student application");
        JLabel l1 = new JLabel("First Name");
        JTextField tf1 = new JTextField();
        JLabel l2 = new JLabel("Last Name");
        JTextField tf2 = new JTextField();
        JLabel l3 = new JLabel("Address");
        JTextField tf3 = new JTextField();
        JLabel l4 = new JLabel("email");
        JTextField tf4 = new JTextField();
        JLabel l5 = new JLabel("id");
        JTextField tf5 = new JTextField();
        JButton b1 = new JButton("Submit");
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(tf1.getText().length() > 0 && tf2.getText().length() > 0){
                    JOptionPane.showMessageDialog(b1, "Logged in");
                }else{
                    JOptionPane.showMessageDialog(b1, "Invalid id password");
                }
            }
        });
        JButton b2 = new JButton("Clear");
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf1.setText("");
                tf2.setText("");
            }
        });
    }
}
