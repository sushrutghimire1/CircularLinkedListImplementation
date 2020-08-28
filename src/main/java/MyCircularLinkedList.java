public class MyCircularLinkedList {

    Node head;
    Node tail;


    public MyCircularLinkedList()
    {
        head=null;
    }

    public void insertNode(int value)
    {
        Node node= new Node(value);
        if(head==null)
        {

            head=node;
            tail=node;
            node.setNext(head);

        }
        else {
            tail.setNext(node);
            tail = node;
            tail.setNext(head);
        }

    }

    public void removeNode()
    {
        if(head!=null) {
            Node removedNode = head;
            head = head.getNext();
            tail.setNext(head);
            removedNode.setNext(null);
        }

    }
    public void printAllNodes()
    {
        Node temp=head;
        if(temp!=null) {
            do {
                System.out.print(temp.getValue());
                System.out.print("->");
                temp = temp.getNext();
            } while (temp != head);
        }
        System.out.print("null");
    }
}
