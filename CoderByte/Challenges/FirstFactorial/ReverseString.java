import java.util.*; 
import java.io.*;
/**
 * Write a description of class ReverseString here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReverseString {
    // instance variables - replace the example below with your own
    private int x;
    
    /**
     * Constructor for objects of class ReverseString
     */
    public ReverseString() {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y) {
        // put your code here
        return x + y;
    }
    
    public static String ReversedWord(String sen) {
        String reversedWord = "";
        for (int i = sen.length() - 1; i >= 0; i--)
            reversedWord += sen.substring(i, i + 1);
        return reversedWord;
    }
    
    public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.println("Palabra a reversar:");
        System.out.print(ReversedWord(s.nextLine())); 
    }   
}
