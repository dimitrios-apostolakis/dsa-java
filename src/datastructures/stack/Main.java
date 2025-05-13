package datastructures.stack;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(8);
        myStack.push(1);
        myStack.push(2);

        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();

        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.printStack();
    }
}
