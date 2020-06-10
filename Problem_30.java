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
public class Problem_30 { // Program to read a char and display whether it is lowercase alphabet or not.
    public static void main (String args[]){
        
        /*
            ASCII value ranges :
            For capital alphabets : 65 - 90
            For small alphabets : 97 - 122
            For Digits : 48 - 57
            All other cases are special charachter
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a aplphabet to check whether it is lowercase or not: ");
        char a = sc.next().charAt(0);
        
        if ( a >= 122 && a<= 97)
            System.out.print(a + " is lowercase alphabet");
        else
            System.out.print(a + " is not a lowercase alphabet");
    }
}
