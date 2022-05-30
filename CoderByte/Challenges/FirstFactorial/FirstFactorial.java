/**
 * Write a description of class FirstFactorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*; 
import java.io.*;

class FirstFactorial {  
    /**
     * Constructor for objects of class FirstFactorial
     */
    public FirstFactorial() {
        // initialise instance variables
        //x = 0;
    }
    
    public static int FirstFactorial(int num) { 
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
        if (num == 1)
            return num;
        else
            return (num * FirstFactorial(num - 1));
    } 
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */ 
    public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un número");
        System.out.print(FirstFactorial(s.nextInt())); //nextLine()));
    }   
}
