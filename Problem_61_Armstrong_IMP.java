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
public class Problem_61_Armstrong_IMP {
    public static void main (String args[]){
        
        /*
          Program to read two numbers and display all the
          armstrong numbers btw given two numbers.
        */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First Number: ");
        int fn = sc.nextInt();
        System.out.println("Enter last Number: ");
        int ln = sc.nextInt();
        
        int co = fn ;
        int sum  = 0 ;
        int temp;
                
        while ( fn != ln ){
                temp = co % 10 ;
                sum  = sum + temp * temp * temp ;
                co /= 10 ;
                
                if ( sum == fn ){
                    System.out.println( sum + " is a armstrong number.");
                }
                
        }
    }
}