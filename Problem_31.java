/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.understanding.programs;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author JOHN
 */
public class Problem_31 { // Program to read a char and display whether it is lowercase alphabet or not.
    public static void main (String args[]){
        
        /*
            ASCII value ranges :
            For capital alphabets : 65 - 90
            For small alphabets : 97 - 122
            For Digits : 48 - 57
            All other cases are special charachter
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char a = sc.next().charAt(0);
        
        if ( ( a >=65 && a <= 90) ||  ( a >=97 && a <=122 ) ){
            System.out.println(a + " is a Alphabet");
        }
        else if ( a >= 48 && a <= 57){
            System.out.println(a + " is a digit");
        }
        else
            System.out.println(a + " is a Special Character");   
    }
}
