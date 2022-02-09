/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprog;
// program that prints a pattern
import java.util.*;

/**
 *
 * @author shalmon
 */
public class pattern {
public static void main(String args[])
{
    int i,j,n = 5;
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=i;j++)
        {
            System.out.print((char)(j+64) + " ");
        } 
        System.out.println("");
    }
}
}

