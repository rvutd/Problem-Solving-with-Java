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
public class Problem_38 {// Program to read a number btw ( 0 to 6 ) and display corresponding weekdays name.
    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number btw 0 to 6: ");
        int n = sc.nextInt(); // number btw 0 to 6
        
        if ( n >= 0 && n <=6 )
            
            switch (n){
                
                case 0 :
                    System.out.print("Sunday");
                case 1 :
                    System.out.print("Monday");
                case 2 :
                    System.out.print("Tuesday");
                case 3 :
                    System.out.print("Wednesday");
                case 4 :
                    System.out.print("Thursday");
                case 5 :
                    System.out.print("Friday");
                case 6 :
                    System.out.print("Saturday");
            }
        else 
            System.out.print("erroe 404 : Please enter a number between 0 to 6");
    
  }
    
}
