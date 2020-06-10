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
public class Problem_08_co { // program to take number from user and print individual digits without loop
    public static void main( String[] args ) {
        
        int num , st , nd , rd , fourth , fth ;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter an integer number: ");
        num = sc.nextInt();
        sc.close();
        
        st =           num / 10000 ;
        nd =         ( num / 1000 ) % 10 ;    
        rd =         ( num / 100 ) % 10 ;
        fourth =     ( num / 10 ) % 10 ;
        fth =          num % 10  ;
        
        System.out.println("indidual digits - " + st + " ," + nd + " ," + rd + " ," + fourth + " ," + fth + ".");
    }
}