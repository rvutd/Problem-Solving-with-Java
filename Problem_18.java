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
public class Problem_18 { // Program to read two number and swap them using third variable.
    public static void main ( String [] args ) {
        
        double first , second , thirdv ;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number a = ");
        first = sc.nextInt();
        System.out.println("Enter second number b = ");
        second = sc.nextInt();
        
        thirdv = first ;
        first = second ;
        second = thirdv ;
        
        System.out.println("Now the first number a is: " + first);
        System.out.println("Now the second number b is: " + second);
    }
    
}
