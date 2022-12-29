  Node insertAtEnd(Node head, int x)
    {
        if(head==null){
            Node newNode = new Node(x);
            newNode.next = null;
            return newNode;
        }
       Node newNode = new Node(x);
       Node temp = head;
       temp.next = head.next;
       while(temp.next!=null){
           temp = temp.next;
       }
       temp.next = newNode;
       newNode.next = null;
       return head;
       
    }
