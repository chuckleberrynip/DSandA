// Work in progress: aim is to find all the zeroes within the array and then shift all of them to the end of the array, but still maintaining the 
// respective ordering of the values that are already within the array.
// This is done by iterating throughout the array, and having creating a trailing value. As we go along the array, if a zero is found then we perform a swap,
// if not then we continue iterating throughout the array. 
import java.util.*;
import java.io.*;

public class ShiftZeroes { 
    public static void main(String[] args) { 
        int [] tester = new int[]{1,2,0,0,4,3,0,3,4,7,8,0};
        System.out.println("Here is the array as it is: " + Arrays.toString(tester));
        shiftThem(tester);
        System.out.println("Here is the array with all the zeroes shifted to the end: " + Arrays.toString(tester));
    }
    public static void shiftThem(int [] holder) { 
        int j = 0;
        for (int i = 0; i < holder.length; i++) { 
            if(holder[i] != 0 && holder[j] == 0) { 
                int temp = holder[i];
                holder[i] = holder[j];
                holder[j] = temp;
            }
            if(holder[j] != 0) { 
                j++;
            }
        }
    }

}