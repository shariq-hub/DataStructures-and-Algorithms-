public class Linkedlist{
    Node head;
    static class Node //This class is static because main can access it.
    {
        Node next;
        int data;
        Node(int d){
            this.data=d;
            next=null;
        }
    }
    public void printList() // Will print Linked list 
    {
        Node n=head;
        while(n!=null){
            System.out.println(n.data+" ");
            n=n.next;
        }
    }
    public static void main(String[] args) {
        Linkedlist l=new Linkedlist();
        l.head=new Node(4);
        Node second=new Node(5);
        Node third=new Node(6);
        l.head.next=second; // here we made connection between head and second node 
        second.next=third; // here we did connection between second and third node
        //l.printList();
        l.push(3);
        l.printList();
    }
    public void push(int data) // This Method use to add a node in front of Linked list 
    {
        Node n=new Node(3);
        n.next=head;
        head=n;
    }

    }



