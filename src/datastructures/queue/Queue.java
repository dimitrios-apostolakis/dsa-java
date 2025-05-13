package datastructures.queue;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public void getFirst(){
        System.out.println("First: " + first.value);
    }

    public void getLast(){
        System.out.println("Last: " + last.value);
    }

    public void getLength(){
        System.out.println("Length: " + length);
    }

    public void printQueue(){
        System.out.println("\nQueue:");
        Node temp = first;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void enqueue(int value){ //add item to end - fifo
        Node newNode = new Node(value);
        if (length == 0){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue(){  //remove item from start - last in last out
        if (length == 0){
            return null;
        }
        Node temp = first;
        first = first.next;
        temp.next = null;
        length--;
        if (length == 0){
            first = null;
            last = null;
        }
        return temp;
    }
}
