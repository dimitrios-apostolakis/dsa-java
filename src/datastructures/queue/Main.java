package datastructures.queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(5);
        myQueue.enqueue(12);
        myQueue.enqueue(13);

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();
        myQueue.printQueue();
    }
}
