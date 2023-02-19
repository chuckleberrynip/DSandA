/* The way of solving is by taking the sum of the whole array and finding what is missing by subtracting the theoretical amount by the actual amount */
import java.util.*;
import java.io.*;
public class FindMissing { 
    public static void main(String[] args) { 
        int [] tester = new int[]{1,2,3,4,5,7,8}; // The missing number in this case is 6
        int sum = 8 * (8+1) / 2; 
        System.out.println("The sum of the first 8 natural numbers are: " + sum);
        for(int num : tester) { 
            sum -= num;
        }
        System.out.println("The missing number is: " + (sum));

    }
}