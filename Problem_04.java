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

public class Problem_04 { // Program to accept student marks in 3 subjects and calculate total, percentage and print it.
    public static void main (String [] args) {
        
        double p , m , c , t, per ;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks obtained in physics: ");
        p = sc.nextDouble();
        
        System.out.println("Enter marks obtained in chemistry: ");
        c = sc.nextDouble();
        
        System.out.println("Enter marks obtained in mathematics: ");
        m = sc.nextDouble();
        
        sc.close();
        
        t = p + c + m ;
        per =  t / 300  * 100 ;
        System.out.println("total marks obtained are: " + t + " and percentage obtained are: " + per );
    }
    
}
