import java.util.*; 
import java.io.*;
/**
 * Write a description of class LongestWord here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LongestWord {
    // instance variables - replace the example below with your own
    private int x;
    private String longestWord;
    
    public static String LongestWord(String sen) { 
    
        ArrayList<String> words = new ArrayList<String>();
        int length = sen.length();
        int x = -1;
        int y = 0;
        boolean isEnd = false;
        
        while (!isEnd) {
            y = sen.indexOf(" ", x + 1);
            if (y > 0) {
                words.add(sen.substring(x + 1, y));
                x = y;
            }
            else {
                words.add(sen.substring(x + 1));
                isEnd = true;
            }
        }
        
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length())
                longest = word;
        }
        //words.toString();
        
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
    return longest;
    
    } 
    
    public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.println("Frase:");
    System.out.print(LongestWord(s.nextLine())); 
    }   
}
