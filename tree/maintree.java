package tree;


import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class maintree {



    static void insert(Tree.node root ,int value) {

        if (root==null)
        {
            root=new Tree.node(value);
            System.out.println("Inserted "+value+" at root");
        }



            if (value < root.data) {
                if (root.left == null) {
                    root.left = new Tree.node(value);
                    System.out.println("Inserted " + value + " to the left of " + root.data);
                } else {
                    insert(root.left,value);
                }
            }
            if (value > root.data) {
                if (root.right == null) {
                    root.right = new Tree.node(value);
                    System.out.println("Inserted " + value + " to the right of " + root.data);
                } else {
                    insert(root.right,value);
                }
            }

    }



    static void inordertraversal(Tree.node root)
    {
        //inorder traverse mean first we will going
        //to process all the left nodes of tree
        //TC =O(n)
        //Space complexity=O(hight of tree)
        if (root!=null)
        {
              inordertraversal(root.left);
              System.out.println("root left is "+root.data);
              inordertraversal(root.right);
        }
    }

    static void preordertraersal(Tree.node root)
    {
        if (root!=null)
        {
            System.out.println(root.data);

            preordertraersal(root.left);
            preordertraersal(root.right);
        }
    }

    static void postordertravesal(Tree.node root)
    {
        if (root != null) {
            postordertravesal(root.left);
            postordertravesal(root.right);
            System.out.println(root.data);
        }
    }

    static void levelordeTrtraverseal(Tree.node root,int rootd)
    {
        if(root!=null)
        {   if (rootd==root.data){
            System.out.println(root.data+" ");}
            if(root.left!=null) {
                System.out.println(root.left.data + " ");
            }
            if (root.right!=null) {
                System.out.println(root.right.data + " ");
            }
            levelordeTrtraverseal(root.left,Integer.MIN_VALUE);
            levelordeTrtraverseal(root.right,Integer.MIN_VALUE);
        }
        //in this I am using another var to run this  System.out.println(root.data+" "); only 1 time to get the correct output
    }

    static void level_order_traverse_withQ(Tree.node root)
    {
        Queue<Tree.node> Q=new LinkedList<Tree.node>();
        Q.add(root);
        while (!Q.isEmpty())
        {
            Tree.node curr=Q.poll();
            System.out.println(curr.data);
            if (curr.left!=null)
            {
                Q.add(curr.left);
            } if (curr.right!=null)
            {
                Q.add(curr.right);
            }

        }




    }


    static int height(Tree.node root)
    {
        if (root==null)
            return 0;
        else
            return Math.max(height(root.left),height(root.right))+1;

    }


    static int sizeoftree(Tree.node root)
    {
        if (root==null)
            return 0;
        else
            return sizeoftree(root.left)+sizeoftree(root.right)+1;
    }

    static int maxnode(Tree.node root)
    {
        if (root==null)
            return 0;
        else
            return Math.max(root.data,Math.max(maxnode(root.left),maxnode(root.right)));

    }

    static void deletenode(Tree.node root,int value)
    {
        if (value< root.data)
        {
            deletenode(root.left,value);
        } if (value> root.data)
        {
            deletenode(root.right,value);
        }
        // TO DO INCOMPLETE
    }


    public static void main(String[] args) {
        Tree.node root=null;
        insert(root,2);

    }




}
