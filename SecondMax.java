import java.util.*;
import java.io.*;
public class SecondMax {
    public static void main(String[] args) { 
        int [] tester = new int[10];
        Random rand = new Random();
        for (int i = 0; i < tester.length; i++) { 
            tester[i] = rand.nextInt(0, 100);
        }
        System.out.println("Here is the array: " + Arrays.toString(tester));
        System.out.println("The second largest value in the array is: " + findSecondMax(tester));
    }
    public static int findSecondMax(int [] holder) { 
        int secondMax = 0;
        int max = 0;
        for (int i = 0; i < holder.length; i++) { 
            if (max < holder[i]) { 
                secondMax = max;
                max = holder[i];
            } else if (secondMax > max) { 
                secondMax = holder[i];
            }
        }
        return secondMax;
    }
}
