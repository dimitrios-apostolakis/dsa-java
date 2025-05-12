package datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(3);
        myDLL.append(17);
        myDLL.append(7);
        myDLL.append(14);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();
        myDLL.printList();

        System.out.println("Removed: " + myDLL.removeLast().value);
        myDLL.printList();

        myDLL.prepend(23);
        myDLL.printList();

    }
}
