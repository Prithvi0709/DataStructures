package stack.linkedList;
import java.util.Scanner;

public class stackLinkedList {

    static stackNode top;
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        System.out.println("Welcome to Stack (Linked list) Manager");
        int option = 0;

        while(option != 7)
        {
            System.out.println();
            System.out.println("1. Create New Stack");
            System.out.println("2. Delete Stack");
            System.out.println("3. Push");
            System.out.println("4. Pop");
            System.out.println("5. Peek");
            System.out.println("6. Print Stack Elements");
            System.out.println("7. Exit");
            option = sc.nextInt();

            switch(option)
            {
                case 1: if(top == null) createStack();
                        else System.out.println("Stack already created");
                        break;

                case 2: if(top == null) System.out.println("Stack Empty");
                        else deleteStack();
                        break;

                case 3: if(top == null) System.out.println("Please create a stack");
                        else push();
                        break;

                case 4: if(top == null) System.out.println("Stack is empty");
                        else pop();
                        break;

                case 5: if(top == null) System.out.println("Stack is empty");
                        else peek();
                        break;

                case 6: if(top == null) System.out.println("Stack is empty");
                        else printStack();
                        break;

                case 7: System.out.println("Thank you for using stack manager");
                        break;

                default:System.out.println("Invalid Option");
            }


        }


    }

    static void createStack()
    {
        System.out.println("Enter data");
        int data = sc.nextInt();

        top = new stackNode(data);
        printStack();
    }

    static void deleteStack()
    {
        top = null;
        System.out.println("Stack successfully deleted");
    }

    static void push()
    {
        System.out.println("Enter Data:");
        int data = sc.nextInt();
        stackNode newNode = new stackNode(data);

        newNode.next = top;
        top = newNode;

        printStack();
    }

    static void pop()
    {
        top = top.next;
        if(top == null) System.out.println("Stack empty");
        else printStack();
    }

    static void peek()
    {
        System.out.println(top.data);
    }

    static void printStack()
    {
        stackNode iter = top;

        System.out.print("Top --> ");
        if(top.next == null)
        {
            System.out.print(top.data+" ");
            return;
        }
        while(iter != null)
        {
            System.out.print(iter.data+" ");
            iter = iter.next;
        }
    }
}


class stackNode
{
    stackNode next;
    int data;

    //Constructor
    stackNode(int data)
    {
        this.data = data;
    }

}