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
public class Problem_23 { // Program to read age of a person and check if he/she is eligible for voting or not.
    public static void main (String[] args){
        
        int age ;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        
        if ( age > 18 )
            System.out.println("You are eligible for voting.");
        else
            System.out.println("You are not eligible for voting.");
    }
}
