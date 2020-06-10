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
public class Problem_25 {// Program to read two numbers and display the maximum.
    public static void main (String [] args ){
        
        float a , b ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = in.nextInt();
        System.out.println("Enter first number: ");
        b = in.nextInt();        
        
        if ( a > b) 
            System.out.println(a + " is greater than second number.");
        else
            System.out.println(b + " is greater than first number.");
    }
}
