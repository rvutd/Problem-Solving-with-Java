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
public class Problem_43 { // Program to read a number and display whether it is power of 2 or not.
    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number to check whether it is power of 2 or not: ");
        int num = sc.nextInt();
        int co = num ;
        
        for ( int i = 0 ; i < co ; i++ ){
            
            if ( num % 2 == 0 ){
                
                if ( num / 2 == 1){
                    System.out.println(co + " is a power of 2.");
                    i = co ; 
                }
                else 
                    System.out.println(co + " is not a power of 2.");            
            }
            else
                System.out.println( co + " is not a power of 2.");
                i = co ;
        }        
    }
}
