/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_connection;

/**
 *
 * @author nasha
 */
import java.sql.*;
public class JDBC_CONNECTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Registered");
            Connection con;
            Statement smt;
            con=DriverManager.getConnection("jdbc:mysql://localhost/world","root","Anandas!#66");
            System.out.println("Connection Successful");
            smt=con.createStatement();
            String sql = "select name from country";
            System.out.println("table country selected");
            //smt.executeUpdate(sql);
            ResultSet rs = smt.executeQuery(sql);
            while(rs.next()){
                String country;
                country = rs.getString("name");
                System.out.println("Name: " + country);
            }
            //System.out.println("inserted");
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
