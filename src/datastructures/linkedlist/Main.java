package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList();
        myLinkedList.append(5);
        myLinkedList.append(2);
        myLinkedList.append(9);

        LinkedList.printList(myLinkedList);
    }
}
