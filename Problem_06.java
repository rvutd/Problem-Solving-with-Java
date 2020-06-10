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

public class Problem_06 { // problem to read a number and find whether its even or not.
    public static void main ( String[] args) {
        int value ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        value = sc.nextInt();
        
        if ( value % 2 == 0 )
        {
            System.out.println( value + " is an even number");
        }
        else 
            System.out.println( value + " is an odd number");
    }    
}
