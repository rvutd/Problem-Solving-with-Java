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
public class Problem_42 { // Program to read a number and display each digit of numbers in words
    public static void main(String args[] ){
        
    /*
        Example :
        input  : 123
        output : one two three
    */
        
    Scanner sc = new Scanner(System.in);
       
    System.out.println("Eneter a number: ");
    int n  = sc.nextInt(); // Number taken from user
                 
    
    // looo for printing in letters.
    while ( n > 0){
        
    int  co  = n % 10 ;    // checking & storing variable
         n  /= 10 ;
        
        if ( co == 0){
            System.out.println("Zero");
        }
        if ( co == 1){
            System.out.println("one");
        }
        if ( co == 2){
            System.out.println("two");
        }
        if ( co == 3){
            System.out.println("three");
        }
        if ( co == 4){
            System.out.println("four");
        }
        if ( co == 5){
            System.out.println("five");
        }
        if ( co == 6){
            System.out.println("six");
        }
        if ( co == 7){
            System.out.println("seven");
        }
        if ( co == 8){
            System.out.println("eight");
        }
        if ( co == 9){
            System.out.println("nine");
        }

    } 
  }
}
