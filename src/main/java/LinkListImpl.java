import java.util.Arrays;

public class LinkListImpl {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
        Node(){
            next = null;
        }
    }

    // Add Data in the linklist sequencetially
    public void add(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        } else {
            Node new_node = new Node(value);
        
            new_node.next = null;

            // Iterate up to last node so that append is possible
            Node lastNode = head;
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = new_node;

            return;
        }

    }

    // Remove First Data In LinkList
    public  void removeFirst(){
        if(head == null){
            return;
        }else{
            head = head.next;
            return ;
        }
    }

    // Remove Last Data In LinkList
    public void removeLast(){
        if(head == null){
            return;
        }else{
            Node last = head;
            Node secondLast = null;

            while(last.next != null){
                secondLast = last.next;
            }
            return ;
        }
        
    }

    public void printList() {
        Node toBePrint = head;
        while (toBePrint != null) {
            System.out.print(toBePrint.data + "       ");
            toBePrint = toBePrint.next;
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        LinkListImpl myLinkList = new LinkListImpl();
        myLinkList.add(5);
        myLinkList.add(6);
        myLinkList.add(7);
        myLinkList.add(8);
        myLinkList.add(9);
        
        myLinkList.printList();

        myLinkList.removeFirst();

        myLinkList.printList();

        myLinkList.removeLast();

        myLinkList.printList();


    }
}
