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
public class Problem_73 { // Program to print 1 to 10 mathematical tables.
    public static void main (String args[]){
        
        int n = 1 ; 
        
        for ( int i = 1 ; i <= 10 ; i++){
            
            System.out.println(n + " X " + i + " = " + n * i );
            if ( i == 11){
                n++;
                i = 1  ;
            }
            if ( n == 10 ){
                i = 11 ;     
            }
        }
    }    
}
