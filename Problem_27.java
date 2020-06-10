/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.understanding.programs;

import java.util.Scanner;

/**
 *
 * @author JOHN
 */
public class Problem_27 {// Program to read three number and dispaly minimum.
    public static void main (String [] args ){
        
        float a , b , c ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = in.nextInt();
        System.out.println("Enter second number: ");
        b = in.nextInt();        
        System.out.println("Enter third number: ");
        c = in.nextInt();
        
        if ( a > b && b > c){ 
            System.out.println(a + " is greater than second number.");
        }
        if ( b > c){ 
            System.out.println(b + " is greater than second number.");
        }
        else
            System.out.println(c + " is greater than first number.");
    
    }
}
