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
public class Problem_22 { // Program to read a number and display whether the number is positive or negative.
    public static void main ( String[] args ) {
        int num  ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        num = sc.nextInt();
        
        if ( num > 0 )
            System.out.println(num + " is a positive number.");
        else
            System.out.println(num + " is a negative number.");        
    }
}
