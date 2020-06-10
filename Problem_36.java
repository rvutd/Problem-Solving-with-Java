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
public class Problem_36 { // Program to read a year and check wheter its leap year or not.
    public static void main ( String args[]){
     
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a year to check whether it is leap year or not: ");
        int year = sc.nextInt();
        
        if ( year % 4 == 0){
            if ( year % 100 == 0){
                if ( year % 400 == 0)
                    System.out.println( year +" is a leap year.");
                else
                    System.out.println( year +" is not a leap year.");
            }
            else
                System.out.println( year +" is a leap year.");
        }
        else 
            System.out.println( year +" is not a leap year.");
    }
}