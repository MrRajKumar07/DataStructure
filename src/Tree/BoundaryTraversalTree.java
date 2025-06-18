package Tree;

import java.util.*;

class Node{
    int val;
    Node left,right;
    Node(int data){
        val=data;
        left=right=null;
    }
}
public class BoundaryTraversalTree {
     void printBoundary(Node root){
        if(root==null) return ;
        System.out.print(root.val+" ");
        
        printLeftBoundary(root.left);
        printLeaves(root.left);
        printLeaves(root.right);
        printRightBoundary(root.right);
        
    }
     void printLeftBoundary(Node node){
         if(node==null) return;
         if(node.left!=null){
             System.out.print(node.val +" ");
             printLeftBoundary(node.left);
         }
         else if(node.right!=null){
             System.out.println(node.val+" ");
             printLeftBoundary(node.right);
         }
     }
     void printLeaves(Node node){
         if(node==null) return;
         printLeaves(node.left);
         if(node.left==null && node.right==null){
             System.out.print(node.val+ " ");
         }
             printLeaves(node.right);
         
     }
     
     void printRightBoundary(Node node){
         if(node==null) return;
         if(node.right!=null){
             printRightBoundary(node.right);
             System.out.println(node.val+" ");
         }
         else if(node.left!=null){
             printRightBoundary(node.left);
             System.out.print(node.val +" ");
         }
     }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right=new Node(3);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        
        BoundaryTraversalTree bt=new BoundaryTraversalTree();
        System.out.println("Boundary Traversal: ");
        bt.printBoundary(root);
        
    }
}
