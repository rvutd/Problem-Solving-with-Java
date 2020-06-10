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
public class Problem_34 { // Program to read a char and display its upper case character.
    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);     
        
        System.out.println("Enter a character: ");
        char a = sc.next().charAt(0);
        
        System.out.println(Character.toUpperCase(a));
    }
}
