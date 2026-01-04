// User function Template for Java

/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node divide(Node head) {
        
        if(head == null || head.next == null) return head;
        // create two LL's one for odd and other for even
        Node evenHead = null, evenTail = null;
        Node oddHead = null, oddTail = null;
        
        Node temp = head;
        while(temp != null){
            if(temp.data % 2 == 0){
                if(evenHead == null){
                    evenHead = temp;
                    evenTail = temp;
                }else{
                    evenTail.next = temp;
                    evenTail = temp;
                }
            }
            else{
                if(oddHead == null){
                    oddHead = temp;
                    oddTail = temp;
                }else{
                    oddTail.next = temp;
                    oddTail = temp;
                }
            }
            temp = temp.next;
        }
        if(evenHead == null) return oddHead;
        if(oddHead == null) return evenHead;
        
        evenTail.next = oddHead;
        oddTail.next = null;
        
        return evenHead; 
    }
}