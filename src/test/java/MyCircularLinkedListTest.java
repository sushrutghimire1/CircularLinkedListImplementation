import org.junit.jupiter.api.Test;



public class MyCircularLinkedListTest {

    @Test
    void EmptyList()
    {
        MyCircularLinkedList linkedList=new MyCircularLinkedList();
        linkedList.printAllNodes();
        //outputs null
    }

    @Test
    void addFirstNode()
    {
        MyCircularLinkedList linkedList=new MyCircularLinkedList();
        linkedList.insertNode(1);
        linkedList.printAllNodes();
        //1->null
    }

    @Test
    public void addMoreThanTwoNodes()
    {
        MyCircularLinkedList linkedList=new MyCircularLinkedList();
        linkedList.insertNode(1);
        linkedList.insertNode(2);
        linkedList.insertNode(3);
        linkedList.printAllNodes();
        //1->2->3->null
    }

    @Test
    public void removeFirstNode()
    {
        MyCircularLinkedList linkedList=new MyCircularLinkedList();
        linkedList.removeNode();
        linkedList.printAllNodes();
        //null
    }
    @Test
    public void removeForMoreThanOneNodes()
    {
        MyCircularLinkedList linkedList=new MyCircularLinkedList();
        linkedList.insertNode(1);
        linkedList.insertNode(2);
        linkedList.removeNode();
        linkedList.printAllNodes();
    }

}
