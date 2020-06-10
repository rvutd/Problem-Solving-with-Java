/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.understanding.programs;
import java.util.Scanner;
import java.lang.*;
/**
 *
 * @author JOHN
 */
public class Problem_32 { // Program to read group of characters and check the following.
    public static void main (String args[]){
    /*
        1. Upper Case.
        2. Lower Case.
        3. Digit.
        4. Special Character.
    */
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a character: ");
    char a = sc.next().charAt(5);
    
    if ( a >= 48 && a <= 57){
        System.out.println("It is a digit.");
    }
    if ( a >= 65 && a <=90 ){
        System.out.println("It is Upper Case.");
    }
    if ( a >= 97 && a <= 122){
        System.out.println("It is a Lower Case.");
    }
    else 
        System.out.println("It is a Special Character.");
    
    
    }
}
