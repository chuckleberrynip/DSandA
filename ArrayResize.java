// WIP: The aim is to take an array and then to resize that array to a desired size, the contents of the length should be the same
import java.util.*;
import java.io.*;
public class ArrayResize {
    public static void main(String[] args) { 
        int [] tester = new int[]{1,2,3,4,5,6};
        System.out.println("This is how the array looks as it is: " + Arrays.toString(tester));
        resizeArray(tester, 4);
        System.out.println("Now the array is going to have 4 elements: " + Arrays.toString(tester));
    }
    public static void resizeArray(int[] holder, int desiredSize) { 
        int [] placer = new int[desiredSize]; 
        for (int i = 0; i < placer.length; i++) { 
            placer[i] = holder[i];
        }
        holder = placer;
    }
}
