package LinkedListDemo;

class Node {
    int value = 0;
    Node next; //* Self Referential Structure is called as Java LinkedList

    //* Constructor
    Node(int value) {
        this.value = value;
        next = null; //* This is optional, In Java if we don't initialize null, in the next reference
        //* java automatically makes it as null.
    }

    public Node() {

    }

}
public class LinkedListExample{
    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);

        n1.next=n2;
        n2.next=n3;
//        n3.next=null; //* This is Optional

        Node head=new Node(0);
        head.next=n1;
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }



    }
}
