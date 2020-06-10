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

public class Problem_05 { // Program to read three numbers and print the biggest of given three number.
    public static void main ( String[] args) {
        
        float a , b , c;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1st Number: ");
        a = sc.nextFloat();    
        
        System.out.println("2nd Number: ");
        b = sc.nextFloat(); 
        
        System.out.println("3rd Number: ");
        c = sc.nextFloat();
        
        if ( a > b && b > c)
        {
            System.out.println("Largest number among given number is: " + a );
        }
        if ( b > c)
        {
            System.out.println("Largest number amont given number is" + b );
        }    
        else     
            System.out.println("Largest number is:" + c );
    }   
}