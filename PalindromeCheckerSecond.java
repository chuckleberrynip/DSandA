import java.util.*;
public class PalindromeCheckerSecond {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert a word to check if it is a palindrome: ");
        String tester = scan.next();
        boolean checker = true;
        int start = 0;
        int end = tester.length() - 1;
        while(start < end) { 
            if (tester.charAt(start) != tester.charAt(end)) {
                checker = false;
            }
            end--;
            start++;
        }
        System.out.println(checker);
    }   
}
