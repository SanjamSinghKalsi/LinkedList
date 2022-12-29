class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
/*You are required to complete below method*/
class GfG
{
    Node deleteNode(Node head, int x)
    {
	// Your code here
        
        if(x==1){
            head = head.next;
            return head;
        }
        Node temp = head;
        int counter = 1;
        while(counter!=x-1){
            temp = temp.next;
            counter++;
        }
        temp.next = temp.next.next;
        return head;
    }
}
