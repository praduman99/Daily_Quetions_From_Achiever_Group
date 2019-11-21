import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int temp)
    {
        data=temp;
        left=right=null;
    }
}
public class checkBST{
    public static int isBST(Node root,int min,int max)
    {
        if(root==null)
        return 1;
        if(root.data<min ||root.data>max)
        return 0;
        return isBST(root.left, min, root.data) & isBST(root.right, root.data, max); 
    }
    public static  int isBinaryTree(Node root)
    {
        if(root==null)
        return 1;
        return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    static Node root;
    public static void main(String[] args) {
        root=new Node(4);
        root.left=new Node(2);
        root.right=new Node(7);
        root.left.left=new Node(1);
        root.left.right=new Node(3);
        root.right.left=new Node(5);
        root.right.right=new Node(8);
        int ifBST=isBinaryTree(root);
        if(ifBST==1)
        {
            System.out.println("BST");
        }
        else{
            System.out.println("Not a BST");
        }
        
    }
}