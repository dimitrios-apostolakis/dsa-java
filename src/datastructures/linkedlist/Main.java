package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList();
        myLinkedList.append(5);
        myLinkedList.append(2);
        myLinkedList.append(9);

        LinkedList.printList(myLinkedList);

        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast());

        myLinkedList.prepend(3);
        myLinkedList.prepend(2);
        myLinkedList.append(4);
        myLinkedList.prepend(1);

        System.out.println(myLinkedList.removeFirst().value + " value removed");

        LinkedList.printList(myLinkedList);
    }
}
