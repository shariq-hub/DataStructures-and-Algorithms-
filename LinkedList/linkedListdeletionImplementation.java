

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
   public void pushAtFront(int data){
       Node n=new Node(data);
       n.next=head;
       head=n;
   }
   public void pushAfterGivenNode(Node given,int data){
       Node n=new Node(data);
       //given.next=n.next;
       n.next=given.next;
       given.next=n;
   }
   public void Append(int data){
       Node n=new Node(data);
       n.next=null; 
       Node temp=head;
       while(temp.next!=null){
           temp=temp.next;
       }
       temp.next=n;
       
   }
   public void delete(int key){
    Node n=head,prev=null;   //2
    if (n != null && n.data == key) {
        head = n.next; 
        return;
    }
    if(head==null){
           return;
       }
       while(head!=null&&n.data!=key){
        prev=n;   
        n=n.next;
       }
       prev.next=n.next;
       
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
    System.out.println("After deletion");
    linkedList.delete(2);
    linkedList.printList();


    }
    
}


