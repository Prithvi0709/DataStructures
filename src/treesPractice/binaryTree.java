package treesPractice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class binaryTree {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        List<Integer> a = new ArrayList<Integer>();

        Node root = createTree();
        System.out.println("InOrder");
        a = inorderTraversal(root);

        System.out.println(a);

        System.out.println("PreOrder");
        preorderTraversal(root);
        System.out.println("PostOrder");
        postorderTraversal(root);

        int height = height(root);
        System.out.println("Height: "+height);

    }

    static Node createTree()
    {
        Node root = null;

        System.out.println("Enter data:");
        int data = sc.nextInt();

        if(data == -1) return null;

        root = new Node(data);

        System.out.println("Enter data to left of "+data);
        root.left = createTree();

        System.out.println("Enter data to right of "+data);
        root.right = createTree();

        return root;
    }
    
    static List<Integer> a = new ArrayList<Integer>();
    static List<Integer> inorderTraversal(Node root)
    {
       if(root == null) return null;
       inorderTraversal(root.left);
       System.out.println(root.data);
       a.add(root.data);
       inorderTraversal(root.right);

       return a;
    }

    static void preorderTraversal(Node root)
    {
        if(root == null) return;
        System.out.println(root.data);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    static void postorderTraversal(Node root)
    {
        if(root == null) return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.println(root.data);
    }

    static int height(Node root)
    {
        if(root == null) return 0;
        return Math.max(height(root.left),height(root.right)) + 1;
    }
}

class Node{
    Node left,right;
    int data;

    //constructor
    public Node(int data){
        this.data = data;
    }
}
