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
    public class BasicUnderstandingPrograms { // calculate mode of a number
        public static void main(String[] args) { 
           
        int num , i = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        num = sc.nextInt();
               
        while ( num > 0)
        {
         num = num % 10 ;
         System.out.println("Result: " + num);
         num-- ;
        }
        
    }
    
}
