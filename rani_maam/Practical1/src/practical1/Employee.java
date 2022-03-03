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
public class Employee {
    public void showData(String name, int yearofjoining, int salary, String add){
        System.out.println(name + "\t" + yearofjoining + "\t\t    " + salary + "\t" + add);
    }
    
    public static void main(String[] args){
        System.out.println("Name    Year of joining     Salary      Address");
        Employee e1=new Employee();
        e1.showData("Robert", 1994, 50000, "64C-WallStreet");
        e1.showData("Sam", 2000, 30000, "68D-WallStreet");
        e1.showData("John", 1999, 40000, "26B-WallStreet");
    }
}
