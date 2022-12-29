class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        int length = 1;
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
            length++;
        }
        
        return length;
    }
}
