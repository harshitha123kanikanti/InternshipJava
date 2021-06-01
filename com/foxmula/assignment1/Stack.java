package com.foxmula.assignment1;
import java.util.Scanner;
public class Stack {
    private class LinkedList {
        int data;
        LinkedList next;
        LinkedList(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private LinkedList topOfTheStack;
    private int size = 0;
    private void push(int num) {
        LinkedList temp = new LinkedList(num);
        temp.next = topOfTheStack;
        topOfTheStack = temp;
        size++;
    }

    private int pop() {
        if(size == 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        else {
            int poppedElement;
            poppedElement = topOfTheStack.data;
            topOfTheStack = topOfTheStack.next;
            size--;
            return poppedElement;
        }
    }
    private void display() {
        LinkedList curr = topOfTheStack;
        while(curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }
    private int Size() {
        return size;
    }
    public static void main(String[] args) {
        Stack obj = new Stack();
        int ch, data;

        while(true) {
            System.out.println("\n1.For Push ");
            System.out.println("2. For Pop ");
            System.out.println("3. For displaying the Size ");
            System.out.println("4. For displaying Stack ");
            System.out.println("Enter your choice : ");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter data");
                    data = sc.nextInt();
                    obj.push(data);
                    break;
                case 2:
                    System.out.println("Popped data" +obj.pop());
                    break;
                case 3:
                    System.out.println("Size" +obj.Size());
                    break;
                case 4:
                    obj.display();
                    break;
                default:
                    System.out.println("Exit");
            }
            if (ch > 4 || ch < 1) {
                break;
            } 
        }    
    }
}