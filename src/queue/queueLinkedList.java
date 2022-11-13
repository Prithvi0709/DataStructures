package queue;
import java.util.Scanner;

public class queueLinkedList {
    
    //Accessible throughout the program
    static Scanner sc;
    static Node front = null;
    static Node rear = null;


    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int option = 0;

        System.out.println("Welcome to Queue(Linked List) Manager!");
        
        //Menu
        while(option != 6)
        {
            System.out.println();
            System.out.println("1. Create Queue");
            System.out.println("2. Delete Queue");
            System.out.println("3. Add an element");
            System.out.println("4. Delete an element");
            System.out.println("5. Print Queue");
            System.out.println("6. Exit");
            option = sc.nextInt();
            
            switch (option)
            {
                case 1: if(front == null && rear == null) createQueue();
                        else System.out.println("Queue already created");
                        break;
                        
                case 2: if(front == null && rear == null) System.out.println("No Queue found");
                        else deleteQueue();
                        break;

                case 3: if(front == null && rear == null) System.out.println("Create a Queue");
                        else enqueue();
                        break;
                    
                case 4: if(front == null && rear == null) System.out.println("No Queue found");
                        else dequeue();
                        break;

                case 5: if(front == null && rear == null) System.out.println("No Queue found");
                        else printQueue();
                        break;

                case 6: System.out.println("Thank you for using Queue Manager");
                        break;

                default:
                    System.out.println("Invalid option");
            }
        }
        
    }
    
    static void createQueue()
    {
        System.out.println("Enter Data");
        int data = sc.nextInt();
        Node toAdd = new Node(data);
        
        front = toAdd;
        rear = toAdd;
        
        printQueue();
    }
    
    static void deleteQueue()
    {
        front = null;
        rear = null;
        System.out.println("Queue deleted successfully!");
    }
    
    static void enqueue()
    {
        System.out.println("Enter Data");
        int data = sc.nextInt();
        
        Node toAdd = new Node(data);
        
        rear.next = toAdd;
        rear = toAdd;
        
        printQueue();
        
    }
    
    static void dequeue()
    {
        if(front == rear)
        {
            deleteQueue();
            return;
        }
        front = front.next;
        System.out.println("Element Deleted");

        printQueue();
    }
    
    static void printQueue()
    {
        if(front == rear)
        {
            System.out.print(front.data + " ");
            return;
        }
        Node iterator = front;

        System.out.print("Front --> ");
        while(iterator != rear.next)
        {
            System.out.print(iterator.data + " ");
            iterator = iterator.next;
        }
        System.out.println("<-- Rear");

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