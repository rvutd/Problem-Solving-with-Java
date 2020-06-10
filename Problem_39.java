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
public class Problem_39 { // Program to read a number and display first N natural number.
    public static void main (String args[] ){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number: ");
        int n = sc.nextInt(); // Natural Number
        sc.close();
        
        System.out.println("First Natural Numbers are: ");
        
        // To print natual number till n.
        for ( int i = 0 ; i <= n ; i++ ){
            System.out.println( i );
        }
        
        
    }
    
}
