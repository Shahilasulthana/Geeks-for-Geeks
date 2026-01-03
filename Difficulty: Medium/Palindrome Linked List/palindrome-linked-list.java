/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        if(head == null || head.next == null) return true;
        
        Node fast = head;
        Node slow = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node newHead = reverseLL(slow.next);
        Node first = head;
        Node second = newHead;
        
        while(second != null){
            if(first.data != second.data){
                reverseLL(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverseLL(newHead);
        return true;
    }
    
    public Node reverseLL(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseLL(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        
        return newHead;
    }
    
}