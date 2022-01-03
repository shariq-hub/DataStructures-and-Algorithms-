public class Linkedlist{
    Node head;
    static class Node{
        Node next;
        int data;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void push(int data){
        Node n=new Node(data);
        n.next=head;
        head=n;
    }
    
    public void push(Node node,int data){
        Node n=new Node(data); // we create new node
        n.next=node.next;     // here we save the Target node address
        node.next=n;          // here we save the node address to the target node
    }
    public  void printList(){
        Node n=head;
        while(n!=null){
        System.out.println("data is "+n.data);
        n=n.next;
    }
    }


    public static void main(String[] args) {
       Linkedlist linkedlist=new Linkedlist();
       linkedlist.head=new Node(7);
       Node second=new Node(9);
       Node third=new Node(10);
       linkedlist.head.next=second;
       second.next=third;
       linkedlist.printList();
       System.out.println("After Implementing Push Method !");
       linkedlist.push(5);
       linkedlist.printList();
       linkedlist.push(second, 1);
       linkedlist.printList();

    }
    
}


