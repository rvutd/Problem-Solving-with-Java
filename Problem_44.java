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
public class Problem_44 { // Program to read a number and display its multiplication table
    public static void main (String args[] ){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number you need multiplication table of: ");
        int num = sc.nextInt(); // Multiplication table number to be claculated
        
        for ( int i = 1 ; i <= 10 ; i++){
            System.out.println( num + " X " + i + " = " + num * i );
        }
    }
    
}
