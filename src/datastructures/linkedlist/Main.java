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

        System.out.println("get():");
        System.out.println(myLinkedList.get(0).value);
        System.out.println(myLinkedList.get(2).value);
        System.out.println("List:");
        LinkedList.printList(myLinkedList);

        System.out.println("set():");
        System.out.println(myLinkedList.set(0,10));
        System.out.println(myLinkedList.set(2,20));
        System.out.println(myLinkedList.set(3,99));
        System.out.println("List:");
        LinkedList.printList(myLinkedList);

        System.out.println("Insert1:");
        System.out.println(myLinkedList.insert(1,81));
        LinkedList.printList(myLinkedList);
        System.out.println("Insert2:");
        System.out.println(myLinkedList.insert(0,80));
        LinkedList.printList(myLinkedList);
        System.out.println("Insert3:");
        System.out.println(myLinkedList.insert(4,82));
        LinkedList.printList(myLinkedList);

        System.out.println("Removed:");
        System.out.println(myLinkedList.remove(5).value);
        System.out.println(myLinkedList.remove(0).value);
        System.out.println(myLinkedList.remove(1).value);
        System.out.println("List after removal:");
        LinkedList.printList(myLinkedList);

    }
}
