/********************************************
 * Meant to implement a singly linked list: 
 * There are 2 ways of doing that: 
 * 1) Creating your own generic type and then
 *    building from that
 * 2) Using the LinkedList instance that is 
 *    found in the Java.util library
 ********************************************/
import java.util.*;
import java.io.*;
public class SLLData { 
    private ListNode head;
    private static class LinkedList { 
        private int data; // Generic type: This contains the actual value
        private ListNode next; // Pointer to the next node
        
        public ListNode(int data) { 
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        SLLData sll = new SLLData(); // Abbreviation for singly linked list 
        sll.head = new ListNode(10);
        SLLData second = new SLLData(1);
        SLLData third = new SLLData(8);
        SLLData fourth = new SLLData(11);

        // Now we will connect them together to form a chain
        sll.head.next = second; //10 --> 1
        second.next = third; // 10 --> 1 --> 8
        third.next = fourth; // 10 --> 1 --> 8 --> 11 --> null


    }
}