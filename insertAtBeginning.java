   Node insertAtBeginning(Node head, int x)
    {
        if(head==null){
             Node newNode = new Node(x);
             newNode.next = null;
             head = newNode;
             return head;
        }
        else{
            Node newNode = new Node(x);
            newNode.next = head;
            head  = newNode;
            return head;
        }
       
        
    }
    
