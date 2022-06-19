/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paper_4_question_bank;

/**
 *
 * @author Shalmon
 */
import java.sql.*;
import javax.swing.*;
public class Unit3_Q1 {
    
    public Unit3_Q1(){
        //creating frame
        JFrame f = new JFrame();
        
        //creating elements
        JLabel label1 = new JLabel("User name: ");
        label1.setBounds(50,50,100,20);
        JTextField tf1 = new JTextField();
        tf1.setBounds(200,50,100,20);
        JLabel label2 = new JLabel("Password: ");
        label2.setBounds(50,100,150,20);
        JTextField tf2 = new JTextField();
        tf2.setBounds(200,100,100,20);
        JButton b1 = new JButton("ADD");
        b1.setBounds(50, 200, 125, 20);
        JButton b2 = new JButton("CLEAR");
        b2.setBounds(200, 200, 125, 20);
        
        //adding elements to the frame
        f.add(label1);
        f.add(tf1);
        f.add(label2);
        f.add(tf2);
        f.add(b1);
        f.add(b2);
        
        //settings of the frame
        f.setSize(400,350);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con;
            Statement smt;
            con = DriverManager.getConnection("jdbc:mysql://localhost/world", "root", "root");
            smt=con.createStatement();
            
            
            
        }catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
