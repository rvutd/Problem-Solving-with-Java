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
public class Problem_71 { // Program to print sum of the natural numbers from 0 to 10.
    public static void main(String args[]){
    
    int   n = 0 ; 
    int sum = 0 ;
    
    while ( n <= 10 ){
        sum = sum + n ;
        n++;
    }
    System.out.println("Sum of natural numners from 0 to 10 is " + sum);
    }
}
