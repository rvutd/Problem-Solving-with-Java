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
import java.math.BigInteger;
import java.util.Scanner;
public class Problem_20 { // Progaram to read two number and display sum.
    public static void main (String [] args ){
        
        String a , b ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        a = sc.nextLine();
        System.out.println("Enter value of b: ");
        b = sc.nextLine();
        
        BigInteger first  = new BigInteger(a);
        BigInteger second = new BigInteger(b);
        BigInteger sum ;
        
        sum = first.add(second) ;
        System.out.println("Sum of two values is = " + sum);
    }
    
}
