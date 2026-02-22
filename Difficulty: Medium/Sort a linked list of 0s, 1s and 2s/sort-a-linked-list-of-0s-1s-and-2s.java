/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        // find the length of the linked list first
        int length = 0;
        Node temp = head;
        while(temp != null){
            length ++;
            temp = temp.next;
        }
        int[] arr = new int[length];
        temp = head;
        int i = 0;
        while(temp != null){
            arr[i++] = temp.data;
            temp = temp.next;
        }
        Arrays.sort(arr);
        temp = head;
        i = 0;
        while(temp != null){
            temp.data = arr[i++];
            temp = temp.next;
        }
        return head;
        
    }
}