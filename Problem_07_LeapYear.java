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

public class Problem_07_LeapYear { // Program to accept a year and check whether the given year is leap year or not.
    public static void main ( String[] args ) {
        
        int year ;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a year: ");
        year = sc.nextInt();
        
        boolean isleap = false ;
        
        if ( year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0)
                    isleap = true ;
                else 
                    isleap = false ;
                }
            else 
                isleap = true ;
            }
        else 
            isleap = false ;
        
        
        if ( isleap == true ){
            System.out.println( year + " is a leap year");
        }
        else 
            System.out.println( year + " is not a leap year"); 
    }
}
