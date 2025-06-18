package Tree;

import java.util.*;

class treeNode{
    int val;
    treeNode left,right;
    treeNode(int data){
        val=data;
        left=right=null;
    }
}
public class RightViewTree {
    public List<Integer> rightView(treeNode root){
        List<Integer> rightViewList =new ArrayList<>();
        if(root==null)
            return rightViewList;
        
        Queue<treeNode> queue=new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            treeNode current=null;
            
            for (int i=0;i<levelSize;i++){
                current=queue.poll();
                if (current.left!=null)
                    queue.offer(current.left);
                if(current.right!=null)
                    queue.offer(current.right); 
            }
            rightViewList.add(current.val);
        }
        return rightViewList;
    }
  public static void main (String[] args){
        RightViewTree tree=new RightViewTree();
        
        treeNode root= new treeNode(1);
        root.left=new treeNode(2);
        root.right=new treeNode(3);
        root.left.right=new treeNode(5);
        root.right.right=new treeNode(4);
        
        List<Integer> result=tree.rightView(root);
        System.out.println("Right View Of Tree : "+result);
    }
}
