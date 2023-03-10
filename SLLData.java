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
    private static class ListNode { 
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
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // Now we will connect them together to form a chain
        sll.head.next = second; //10 --> 1
        second.next = third; // 10 --> 1 --> 8
        third.next = fourth; // 10 --> 1 --> 8 --> 11 --> null
        
        sll.insertFirst(12);
        int listElements = sll.listLength();
        System.out.println("The length of the list is: " + listElements);
        sll.display();
    }
    public void display() { 
        ListNode current = head;
        while(current != null) { 
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
    }
    public int listLength() { 
        ListNode current = head;
        if(current == null) { return 0;}
        int count = 0;
        while (current != null) { 
            count++;
            current = current.next;
        }
        return count;
    }
    public void insertFirst(int value) { 
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }
}