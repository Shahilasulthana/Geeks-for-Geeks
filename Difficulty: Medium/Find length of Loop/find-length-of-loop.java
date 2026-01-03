/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            // confirms whether there is a loop exists
            if(fast == slow){
                
                // if there is a loop then initialize a counter and increment in along with t
                // slow pointer
                int count = 1;
                Node temp = slow.next;
                
                while(temp != slow){
                    count += 1;
                    temp = temp.next;
                }
                return count;
            }
        }
        return 0;
    }
}