import java.util.*;
public class ReverseArray { 
	public static void main(String[] args) { 
		int [] tester = new int[]{1,2,3,4};
		System.out.println("Here is how the array normally is:");
		System.out.println(Arrays.toString(tester));
		System.out.println("Now you are going to see the array reversed");
		reverseIt(tester, 0, tester.length - 1);
		System.out.println(Arrays.toString(tester));
	}
	public static void reverseIt(int [] holder, int start, int end) { 
		while(start < end) {
			int temp = holder[start];
			holder[start] = holder[end];
			holder[end] = temp;
			end--;
			start++;
		}
	}

}	
