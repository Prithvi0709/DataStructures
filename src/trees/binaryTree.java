package trees;

import java.util.Scanner;

public class binaryTree {

    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        inorderTraversal(root);
        preorderTraversal(root);
        postorderTraversal(root);
    }

    /* This method creates a tree and returns the root node.
        It recursively adds values for the left and right side.

        It keeps going to the left and once done adding to the left you have to input -1
        then it starts adding for the right

        All this happens recursively

        and once all the right nodes are traversed, it returns the final value and ends the program.
     */

    static Node createTree() {

        Node root = null;
        System.out.println("Enter Data:");
        int data = sc.nextInt();

        if(data == -1) return null;

        root = new Node(data);

        System.out.println("Enter left for " + data);
        root.left = createTree();

        System.out.println("Enter right for "+ data);
        root.right = createTree();
        return root;
    }

    static void inorderTraversal(Node root)
    {
        if(root == null) return;

        inorderTraversal(root.left);

        System.out.println(root.data);

        inorderTraversal(root.right);
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
}

/*  This class will have the node reference
    Every node has 2 parent node has 2 children: Left and Right

    Therefore, this class will have 2 references : Left and Right
 */
class Node{
    Node left, right;
    int data;

    //Constructor of this node
    public Node(int data)
    {
        this.data = data;
    }

}
