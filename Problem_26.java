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
public class Problem_26 { // Program to read two number and dispaly minimum.
    public static void main (String [] args ){
        
        float a , b ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = in.nextInt();
        System.out.println("Enter second number: ");
        b = in.nextInt();        
        
        if ( a < b) 
            System.out.println(a + " is minimum than second number.");
        else
            System.out.println(b + " is minimumS than first number.");
    }
}
