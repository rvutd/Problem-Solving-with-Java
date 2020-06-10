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

public class Problem_03 { // Program to read two numbers and print the sum of given three numbers. 
    public static void main (String [] args) {
     
        int a , b ,c ;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st number: ");
        a = sc.nextInt();
        System .out.println("Enter 2nd number: ");
        b = sc.nextInt();
        
        sc.close();
        
        c = a + b ;
        System.out.println("The sum of two numbers is: " + c );
    }
}
