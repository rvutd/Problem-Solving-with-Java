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
public class Problem_15 { // Program to read a integer value from user and display it
    public static void main ( String [] args ){
         int value ;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter an integer number");
         value = sc.nextInt();
         System.out.println("Entered integer is:- " + value);
    }
 }
