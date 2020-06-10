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
public class Problem_60 { // Program to read a number and display it is armstrong number or not.
    public static void main (String args[]){
        
        /* 
              Angstrom numbers. 
              These are the numbers (0 and 1 excluded) in which the sum of 
              the cube of the digits is equal to the number itself.
              e.g. 153 = 1*1*1 + 5*5*5 + 3*3*3 = 153.
              Three more such numbers are 370, 371 and 407
        */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter a number to check whether it is a armstron number or not: ");
        int arm = sc.nextInt(); // Number given by user.
        int sum = 0 ;           // For storing the result.
        int co = arm ;          // to verify letter
        
        // loop for mathematical operations.
        while ( arm != 0 ){
            int temp = arm % 10 ;  // temp used for temporary mathematical operation in the equation 1.
            sum = sum + temp * temp * temp ; // equaion 1.
            arm /=10 ;
        } 
        
        // contions if = true it is Armstrong number else not a armstrong number.
        if ( sum == co ){
            System.out.print( co + " is a armstrong number.");
        }
        else 
            System.out.print( co + " is not a armstrong number.");
    }
}