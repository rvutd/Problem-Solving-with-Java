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
public class Problem_37 { // Program to read a char and display whether its vowel or consonant.
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        // to take value in character form.
        System.out.println("Enter an alphabet: ");
        char co = sc.next().charAt(0);
        
        // implying conditions for vowels.
        if ( co == 'a' || co == 'e' || co == 'i'|| co == 'o'|| co == 'u' 
          || co == 'A' || co == 'E' || co == 'I'|| co == 'O'|| co == 'U' ){
            System.out.println(co + " is a vowel");
        }  
        else
            System.out.println(co + " is a consonent.");
    }
}
