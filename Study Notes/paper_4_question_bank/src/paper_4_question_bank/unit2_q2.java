package paper_4_question_bank;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shalmon
 */

import java.awt.event.*;
import javax.swing.*;

public class unit2_q2 {
    public static void main(String[] args){
        JFrame f = new JFrame();
        
        JLabel l1 = new JLabel("Application for reverse");
        JLabel l2 = new JLabel("Enter any number");
        JTextField tf1 = new JTextField();
        JLabel l3 = new JLabel("Answer");
        JTextField tf2 = new JTextField();
        JButton b1 = new JButton("Check");
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int num1 = Integer.parseInt(tf1.getText());
                int num2 = Integer.parseInt(tf2.getText());
                int rev = 0;
                while(num1!=0){
                    int rem = num1 % 10;
                    rev = rev*10 +rem;
                    num1=num1/10;
                }
                tf2.setText(Integer.toString(rev));
                if(num1 == num2){
                    System.out.println("It is a palindrome");
                }else{
                    System.out.println("it is not a paplindrome");
                }
            }});
        
        JButton b2 = new JButton("Cancel");
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf1.setText("");
                tf2.setText("");
            }
        });
        
        f.add(l1);
        f.add(l2);
        f.add(tf1);
        f.add(l3);
        f.add(tf2);
        f.add(b1);
        f.add(b2);
    }
}
