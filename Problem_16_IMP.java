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
public class Problem_16_IMP { // Program to read a String value from user and display individual characters.
    public static void main ( String [] args ){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter any word: ");
        String word = sc.nextLine()  ;
        
        for ( int i = 0 ; i < word.length() ; i++ ){
            System.out.println(word.charAt(i) + "");            
        }
    }
}
