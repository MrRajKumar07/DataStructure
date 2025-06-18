package Tree;

import java.util.*;

class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int data){
        val=data;
        left=right=null;
    }
}
public class LeftViewTree {
    public List<Integer> leftView(TreeNode root){
        List<Integer> leftViewList =new ArrayList<>();
        if(root==null)
            return leftViewList;
        
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            TreeNode current=null;
            
            for (int i=0;i<levelSize;i++){
                current=queue.poll();
                
                if(i==0){
                   leftViewList.add(current.val);
                }
                if (current.left!=null)
                    queue.offer(current.left);
                if(current.right!=null)
                    queue.offer(current.right); 
            }
        }
        return leftViewList;
    }
  public static void main (String[] args){
        LeftViewTree tree=new LeftViewTree();
        
        TreeNode root= new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.right.left=new TreeNode(5);
        root.right.right=new TreeNode(6);
        root.right.left.left=new TreeNode(7);
        
        List<Integer> result=tree.leftView(root);
        System.out.println("Left View Of Tree : "+result);
    }
}
