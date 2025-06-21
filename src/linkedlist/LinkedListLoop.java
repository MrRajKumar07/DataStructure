package linkedlist;

 class NodeList{
    int data;
    NodeList next;
    NodeList(int d){
        data = d;
        next = null;
    }
}
public class LinkedListLoop {
    static boolean deleteLoop(Node head){
        Node slow =head, fast=head;
        
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

   public static void main(String[] args){
    Node head = new Node(2);
    head.next = new Node(4);
    head.next.next=new Node(9);
    
   head.next.next.next=head.next;
    
    if(deleteLoop(head)){
        System.out.println("True");
    }
    else{
        System.out.println("False");
    }
}
}


