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
public class Problem_40 { // Program to read a number and display sum of first N natural numbers.
    public static void main ( String args[] ){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt(); // Number 
        int sum = 0 ;
        
        // Sumation of natural numbers
        for ( int i = 0 ; i <= n ; i++ ){
            sum = sum + i ;
        }
        System.out.println("Sum of natural numbers is = "+ sum);
    }
}
