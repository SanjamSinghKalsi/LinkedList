/*
class Node { 
    int data; 
    Node next; 

    Node() { data = 0; }
    Node(int d) { data = d; }  //constructor to create a new node
} 
*/
class Solution {
    static Node constructLL(int arr[]) {
        // code here\
        
      
        Node head = new Node(arr[0]);
        Node temp = head;
        head.next = null;
        for(int i=1;i<arr.length;i++){
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            newNode.next = null;
            temp = newNode;
        }
        
        return head;
    }
}
