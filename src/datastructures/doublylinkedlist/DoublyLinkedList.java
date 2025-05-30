package datastructures.doublylinkedlist;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }
    }

    public void getHead(){
        System.out.println("Head: " + head.value);
    }

    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }

    public void getLength(){
        System.out.println("Length: " + length);
    }

    public void printList(){
        System.out.println("\nList:");
        Node temp = head;
        for (int i=0; i<length; i++){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        if (length==0){
            return null;
        }
        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
        length--;
        if (length==0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if (length==0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        Node temp = head;
        if (length==0){
            return null;
        }
        if (length==1){
            head = null;
            tail = null;
        }else{
            head = head.next;
            temp.next = null;
            head.prev = null;
        }
        length--;
        return temp;
    }

    public Node get(int index){
        if (index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        if (index < length/2){
            for(int i=0; i<index; i++){
                temp = temp.next;
            }
        }else{
            temp = tail;
            for(int i= length-1; i>index; i--){
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if (temp!=null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if (index<0 || index>length){
            return false;
        }
        if (index==0){
            prepend(value);
            return true;
        }
        if (index == length){
            append(value);
            return true;
        }
        Node before = get(index-1);
        Node after = before.next;
        Node newNode = new Node(value);
        before.next = newNode;
        newNode.prev = before;
        newNode.next = after;
        after.prev = newNode;
        length++;
        return true;
    }

    public Node remove(int index){
        if (index<0 || index>=length){
            return null;
        }
        if (index==0){
            return removeFirst();
        }
        if (index == length-1){
            return removeLast();
        }

//        1st way - more readable
//        Node temp = get(index);
//        Node before = temp.prev;
//        Node after = temp.next;
//        before.next = after;
//        after.prev = before;
//        temp.next = null;
//        temp.prev = null;

        //2nd way - use 1 variable
        Node temp2 = get(index);
        temp2.prev.next = temp2.next;
        temp2.next.prev = temp2.prev;
        temp2.next = null;
        temp2.prev = null;

        length--;
        if (length == 0){
            head = null;
            tail = null;
        }
        return temp2;
    }

}
