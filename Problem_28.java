/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.understanding.programs;

/**
 *
 * @author JOHN
 */
import java.util.Scanner;
public class Problem_28 { // Program to read three numbers and display minimum
    public static void main (String [] args ){
        
        float a , b , c ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = in.nextInt();
        System.out.println("Enter second number: ");
        b = in.nextInt();        
        System.out.println("Enter third number: ");
        c = in.nextInt();
        
        if ( a < b && b < c){ 
            System.out.println(a + " is minimum of given three numbers.");
        }
        if ( b < c){ 
            System.out.println(b + " is minimum of given three numbers.");
        }
        else
            System.out.println(c + " is minimum of given three numbers.");
    
    }
    
}
