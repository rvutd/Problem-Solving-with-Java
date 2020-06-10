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
public class Problem_33 {
    public static void main (String args[]){
        /*
           Program to read 3 subjects marks of a student pergorm the foolowing.
           1. Display the total marks obtained.
           2. Display the average of marks.
           3. Display the grade and Remarks as per the following criteria. 
        */
        
        float ta ; // ta is total and average 
        float p  ; // p is physics
        float c  ; // c is chemistry     
        float m  ; // m is maths        
                
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter marks obtained in physics: ");
        p = sc.nextFloat();
        
        System.out.println("Enter marks obtained in chemistry: ");
        c = sc.nextFloat();
        
        System.out.println("Enter marks obtained in Maths: ");
        m = sc.nextFloat();
        
        ta = p + c + m ;
        System.out.println("Total marks obtained = " + ta );
        
        ta /= 3 ;
        System.out.println("Average marks obtained = " + ta );
        
        
        if ( ta >= 80 ){
            System.out.print("Grade = A Excellent");
        }
        if ( ta < 80 && ta >= 70 ){
            System.out.print("Grade = B Very Good");
        }
        if ( ta < 70 && ta >= 60 ){
            System.out.print("Grade = C Good");
        }
        if ( ta < 60 && ta >= 50 ){
            System.out.print("Grade = D Satisfactory");
        }
        if ( ta < 80 && ta >= 70 ){
            System.out.print("Grade = E Failure Try Again");
        }
    }   
}
