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
public class Problem_21 { // Program to convert fahrenheit to celsius ... formula is " c=(f-32) * 5/9 " therefore f = 9/5 * ( c + 32 )
    public static void main (String [] args ) {
        
        int c , f , calc ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temp in fahrenheit: ");
        f = sc.nextInt();
        
        c = ( f - 32 ) * 5/9 ;
        System.out.println("Temp in celsius is: " + c);
    }
}
