package linkedList;
import java.util.Scanner;

public class linkedList {
    static Node head;
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        System.out.println("Welcome to Linked List Manager");

        int option = 0;

        while(option != 6) {
            //Menu
            System.out.println();
            System.out.println("1. Create a new Linked List");
            System.out.println("2. Delete Linked List");
            System.out.println("3. Insert an Element");
            System.out.println("4. Delete an Element");
            System.out.println("5. Print the List");
            System.out.println("6. Exit");
            option = sc.nextInt();
            switch(option)
            {
                case 1: if(head == null)
                        {
                            createList();
                        }
                        else System.out.println("Linked List already created! Insert element using 3");
                        break;

                case 2: if(head == null)
                        {
                            System.out.println("No Linked List to Delete");
                        }
                        else
                        {
                            head = null;
                            System.out.println("Linked List Deleted Sucessfully");
                        }
                        break;

                case 3: if(head == null)
                        {
                            System.out.println("Create a linked list using option 1");
                            break;
                        }
                        else insertNode();
                        break;
                case 4: if(head == null)
                        {
                            System.out.println("Linked List empty");
                        }
                        else deleteNode();
                        break;
                case 5: if(head == null)
                        {
                            System.out.println("Linked List empty");
                        }
                        else printList();
                        break;
                case 6: System.out.println("Thank you for using Linked List Manager");
                        break;
                default:
                    System.out.println("Invalid input. Please try again");
            }
        }
    }


    static void createList()
    {
        System.out.println("Enter Data");
        int data = sc.nextInt();

        Node newNode = new Node(data);

        newNode.next = null;
        head = newNode;
        printList();
    }

    static void insertNode()
    {
        System.out.println("Enter Data");
        int data = sc.nextInt();
        System.out.println("Enter Position");
        int pos = sc.nextInt();

        Node newNode = new Node(data);

        if(pos == 0)
        {
          newNode.next = head;
          head = newNode;
          printList();
          return;
        }

        Node iterator = head;
        for(int i = 0; i< pos - 1;i++)
        {
            iterator = iterator.next;
        }

        newNode.next = iterator.next;
        iterator.next = newNode;
        printList();
    }

    static void deleteNode()
    {
        System.out.println("Enter the Position to Delete");
        int pos = sc.nextInt();

        if(pos == 0)
        {
            head = head.next;
            printList();
            return;
        }
        Node iterator = head;
        for (int i = 0; i < pos - 1; i++)
        {
            iterator = iterator.next;
        }

        iterator.next = iterator.next.next;
        printList();
    }

    static void printList()
    {
        System.out.println();

        Node iterator = head;
        if(head.next == null)
        {
            System.out.println(iterator.data+ " ");
            return;
        }

        while (iterator != null)
        {
            System.out.print(iterator.data+ " ");
            iterator = iterator.next;

        }
    }

}

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
    }
}
