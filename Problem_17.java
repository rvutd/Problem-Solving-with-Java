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
public class Problem_17 { // Program to read one char value from user and display it.
    public static void main ( String[] args ) {
        
        Scanner sc = new Scanner(System.in);
        char character = sc.next().charAt(0);
        System.out.println("Entered character is: " +character);
        
    }
    
}
