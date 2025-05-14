package datastructures.heap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Heap1:");
        Heap myHeap = new Heap();
        myHeap.insert(99);
        myHeap.insert(72);
        myHeap.insert(61);
        myHeap.insert(58);

        System.out.println(myHeap.getHeap());

        myHeap.insert(100);
        System.out.println(myHeap.getHeap());

        myHeap.insert(75);
        System.out.println(myHeap.getHeap());

        System.out.println("Heap2:");

        Heap myHeap2 = new Heap();
        myHeap2.insert(95);
        myHeap2.insert(75);
        myHeap2.insert(80);
        myHeap2.insert(55);
        myHeap2.insert(60);
        myHeap2.insert(50);
        myHeap2.insert(65);

        System.out.println(myHeap2.getHeap());

        myHeap2.remove();
        System.out.println(myHeap2.getHeap());

        myHeap2.remove();
        System.out.println(myHeap2.getHeap());
    }
}
