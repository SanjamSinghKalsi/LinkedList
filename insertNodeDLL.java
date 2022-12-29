

class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data)
	{
		// Your code here
	//	Node head = head_ref;
	if(pos==0){
	    Node newNode = new Node(data);
	    newNode.prev = head_ref;
	    newNode.next = head_ref.next;
	    head_ref.next = newNode;
	    return;
	}
		Node temp = head_ref;
		int counter = 1;
		while(counter !=pos){
		    temp = temp.next;
		    counter++;
		}
		Node newNode = new Node(data);
		newNode.prev = temp.next;
		newNode.next = temp.next.next;
		temp.next.next = newNode;
		
	//	return head;
		
	}
}
