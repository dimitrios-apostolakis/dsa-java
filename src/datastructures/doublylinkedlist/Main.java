package datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(3);
        myDLL.append(17);
        myDLL.append(7);
        myDLL.append(14);
        myDLL.append(18);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();
        myDLL.printList();

        System.out.println("Removed: " + myDLL.removeLast().value);
        myDLL.printList();

        myDLL.prepend(23);
        myDLL.printList();

        System.out.println("RemoveFirst: " + myDLL.removeFirst().value);
        myDLL.printList();

        System.out.println("Get: " + myDLL.get(1).value);
        System.out.println("Get: " + myDLL.get(2).value);
//        myDLL.printList();

    }
}
