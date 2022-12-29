
class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        Node head = new Node(arr[0]);
        head.prev = null;
        head.next = null;
        
        Node temp = head;
        
        for(int i =1 ;i<arr.length;i++){
            Node newNode = new Node(arr[i]);
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next = newNode;
            temp = newNode;
        }
        return head;
        
    }
}
