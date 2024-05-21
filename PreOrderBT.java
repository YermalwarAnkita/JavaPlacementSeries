import java.io.*;
import java.util.*;

public class PreOrderBT
{
static class node
{
 int data;
 node left;
node right;

node(int data)
{
this.data=data;
this.left=null;
this.right=null;
}

}


static class BinaryTree
{
static int idx=-1;
public static node buildTree(int nodes[])
{
idx++;
if(nodes[idx]==-1)
return null;

node newnode=new node(nodes[idx]);
newnode.left=buildTree(nodes);
newnode.right=buildTree(nodes);

return newnode;
}
}
public static void preorder(node root)
{
if(root==null)
 return ;

System.out.print(root.data + " ");
preorder(root.left);
preorder(root.right);
}


public static void inorder(node root)
{
if(root==null)
return ;
inorder(root.left);
System.out.print(root.data + " ");


inorder(root.right);
}


public static void postorder(node root)
{
if(root==null)
return ;

postorder(root.left);
postorder(root.right);
System.out.print(root.data + " ");



}
public static void main(String args[])
{
int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
BinaryTree tree=new BinaryTree();
node root=tree.buildTree(nodes);
System.out.println(root.data);
preorder(root);
System.out.println("");
inorder(root);
System.out.println("");
postorder(root);
}
}