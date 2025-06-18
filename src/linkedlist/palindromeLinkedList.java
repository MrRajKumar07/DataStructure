
package linkedlist;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class palindromeLinkedList {
    
    Node head;
    public boolean isPalindrome(Node head){
        if(head==null ||head.next==null)
            return true;
    
    Node slow=head;
    Node fast = head;
    while(fast!=null && fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
}
    Node secondHalf=reverse(slow);
    
    Node firstHalf=head;
    while(secondHalf!=null){
        if(firstHalf.data==secondHalf.data){
            return false;
        }
        
            firstHalf=firstHalf.next;
            secondHalf=secondHalf.next;
    }
    return true;
  }

   public Node reverse(Node head){
       Node pre=null;
       while(head!=null){
           Node next=head.next;
           head.next=pre;
           pre=head;
           head=next;
       }
       return pre;
   }    
    
    public static void main(String [] args){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter no. of data:");
       int n=sc.nextInt();
       
       if(n==0){
           System.out.println("Empty List");
           return;
       }
       System.out.println("Ener "+n+" Integer");
       Node head=new Node(sc.nextInt());
       Node current=head;
       
       for(int i=0;i<n;i++){
           current.next=new Node(sc.nextInt());
           current=current.next;
       }
        
        palindromeLinkedList pd=new palindromeLinkedList();
        System.out.println("Is this a Palindrome? "+pd.isPalindrome(head));
    }
}
