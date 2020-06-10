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
public class Problem_19 { // Program to read two number and swap them without using third variable.
    public static void main (String [] args) {
        
        int a , b ;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter value of a: ");
        a = sc.nextInt();
        System.out.println("Enter value of b: ");
        b = sc.nextInt();
        
        a = a + b ;
        b = a - b ;
        a = a - b ;
        
        System.out.println("Now the value a is: " + a );
        System.out.println("Now the value b is: " + b );        
    }
}
