

public class Linkedlist{
   Node head;
    static class Node{
        Node next;
        int data;
        Node(int d){
            this.data=d;
            next=null;
        }
   }
   public void Append(int data){
       Node n=new Node(data); // Here we create a new Node
       n.next=null;  // we make new node as null because we will append it to the end
       Node temp=head; // we save the head to transverse the linkedlist till end
       while(temp.next!=null){
           temp=temp.next;   
       }
       temp.next=n; // After reach null we simply add that node reference
       
   }
   public void printList(){
       Node n=head;
       while(n!=null){
           System.out.println("Data is "+n.data);
           n=n.next;
       }
   }

    public static void main(String[] args) {
      Linkedlist linkedList=new Linkedlist();
      linkedList.head=new Node(2);
      Node second=new Node(3);
      Node third=new Node(4);
      linkedList.head.next=second;
      second.next=third;
      linkedList.printList();
    System.out.println("After Append : ");
    linkedList.Append(6);
    linkedList.printList();

    }
    
}


