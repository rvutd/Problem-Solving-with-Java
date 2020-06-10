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
    public class Problem_10 { // Program to take a number from user and print sum of individuals digits
        public static void main ( String[] args ) {
        
        int num , store , adder = 0 ;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter an integer number: ");
        num = sc.nextInt();
        sc.close();
        
        while ( num > 0){
            store = num % 10 ;     
            adder += store ;
            num /= 10 ;
        }
        System.out.println("The sum of individual digits is " + adder );           
    }
}