package datastructures.stack;

public class Stack {
    private Node top;
    private int height;

    public Stack(int value){
        this.top = new Node(value);
        this.height = 1;
    }

    public class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public void printStack(){
        System.out.println("\nStack:");
        Node temp = top;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop(){
        System.out.println("Top: " + top.value);
    }

    public void getHeight(){
        System.out.println("Height: " + height);
    }

    public void push(int value){
        Node newNode = new Node(value);
        if (height == 0){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
        height++;

    }
}
