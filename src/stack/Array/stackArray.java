package stack.Array;
import java.util.Scanner;

public class stackArray {
    // Static variables initialization
    static int top = -1;
    static int capacity;
    static int[] stack;
    static Scanner sc;

    // Main function
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
                case 1: if(top == -1) createStack();
                else System.out.println("Stack already created");
                    break;

                case 2: if(top == -1) System.out.println("Stack Empty");
                        else deleteStack();
                        break;

                case 3: if(top == -1) System.out.println("Please create a stack");
                        else push();
                        break;

                case 4: if(top == -1) System.out.println("Stack is empty");
                        else pop();
                        break;

                case 5: if(top == -1) System.out.println("Stack is empty");
                        else peek();
                        break;

                case 6: if(top == -1) System.out.println("Stack is empty");
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
        System.out.println("Enter Stack Capacity");
        capacity = sc.nextInt();
        stack = new int[capacity];

        System.out.println("Enter data");
        stack[0] = sc.nextInt();
        top = 0;

        printStack();
    }
    static void deleteStack()
    {
       top = -1;
    }
    static void push()
    {
        if(top == capacity - 1)
        {
            System.out.println("Stack Overflow!");
            return;
        }
        System.out.println("Enter Data:");
        top = top + 1;
        stack[top] = sc.nextInt();

        printStack();
    }
    static void pop()
    {
        top = top - 1;

        if(top == -1) System.out.println("Stack Empty");
        else printStack();

    }
    static void peek()
    {
        System.out.println(stack[top]);
    }
    static void printStack()
    {
        System.out.print("Top --> ");
        for(int i = top; i>=0 ; i--)
        {
            System.out.print(stack[i] + " ");
        }
    }

}

