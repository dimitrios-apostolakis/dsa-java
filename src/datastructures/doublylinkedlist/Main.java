package datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(3);
        myDLL.append(17);
        myDLL.append(7);
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();
        myDLL.printList();
    }
}
