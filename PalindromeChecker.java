import java.util.*;
import java.io.*;;
public class PalindromeChecker {
   public static void main(String[] args) { 
    Scanner scan = new Scanner(System.in);
    System.out.println("Hey! Do you wanna know if your word is a palindrome? Put a word in: ");
    String holder = scan.next();
    boolean tester = palindromeFunction(holder);
    System.out.println("The word that you sent is: " + holder);
    System.out.println("The answer is: " + tester);
    scan.close();
   }
   // Should take in a string, create a reversed version and compare it 
   public static boolean palindromeFunction(String val) { 
    String reversy = "";
    for(int i = val.length() - 1; i >= 0; i--) { 
        reversy += val.charAt(i);
    }
    System.out.println(reversy);
    return reversy.toUpperCase().equals(val.toUpperCase());
   }
}
