package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList();
        myLinkedList.append(5);
        myLinkedList.append(2);
        myLinkedList.append(9);

        myLinkedList.printList();

        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast());

        myLinkedList.prepend(3);
        myLinkedList.prepend(2);
        myLinkedList.append(4);
        myLinkedList.prepend(1);

        System.out.println(myLinkedList.removeFirst().value + " value removed");
        myLinkedList.printList();

        System.out.println("get():");
        System.out.println(myLinkedList.get(0).value);
        System.out.println(myLinkedList.get(2).value);
        System.out.println("List:");
        myLinkedList.printList();

        System.out.println("set():");
        System.out.println(myLinkedList.set(0,10));
        System.out.println(myLinkedList.set(2,20));
        System.out.println(myLinkedList.set(3,99));
        System.out.println("List:");
        myLinkedList.printList();

        System.out.println("Insert1:");
        System.out.println(myLinkedList.insert(3,82));  //before insertion, index 3 was out of boundaries
        myLinkedList.printList();
        System.out.println("Insert2:");
        System.out.println(myLinkedList.insert(0,80));
        myLinkedList.printList();
        System.out.println("Insert3:");
        System.out.println(myLinkedList.insert(1,81));
        myLinkedList.printList();

        System.out.println("Removed:");
        System.out.println(myLinkedList.remove(5).value);
        System.out.println(myLinkedList.remove(0).value);
        System.out.println(myLinkedList.remove(1).value);
        System.out.println("List after removal:");
        myLinkedList.printList();

        System.out.println("Before Reverse:");
        myLinkedList.printList();
        System.out.println("After Reverse:");
        myLinkedList.reverse();
        myLinkedList.printList();

    }
}
