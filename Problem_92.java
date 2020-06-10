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
public class Problem_92 { // Program to accept any single digit number and print it in words.
    public static void main (String args[] ) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a single digit number: ");
        int a = sc.nextInt(); // To get and check number after wards
        
        // Conditions to print in words give single digit number
        if ( a == 0 ){      // For zero
            System.out.println("Zero");  
        }
        if ( a == 1 ){      // For one
            System.out.println("One");
        }
        if ( a == 2 ){      // For two
            System.out.println("Two");
        }
        if ( a == 3 ){      // For three
            System.out.println("Three");
        }
        if ( a == 4 ){      // For four
            System.out.println("Four");
        }
        if ( a == 5 ){      // For five
            System.out.println("Five");
        }
        if ( a == 6 ){      // For six
            System.out.println("Six");
        }
        if ( a == 7 ){      // For seven
            System.out.println("Seven");
        }
        if ( a == 8 ){      // For eight
            System.out.println("Eight");
        }
        if ( a == 9 ){      // For nine
            System.out.println("Nine");
        }
        // in case user enters multiple digits 
        else if ( a > 9 ) {
                    System.out.println("Eror 404 : Please enter a single digit number.");
        }
    }
    
}




