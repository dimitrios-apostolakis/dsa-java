package datastructures.graph;

public class Main {
    public static void main(String[] args) {
        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");
        myGraph.printGraph();

        System.out.println(myGraph.addEdge("A", "B"));
        System.out.println(myGraph.addEdge("A", "L"));
        System.out.println(myGraph.addEdge("M", "K"));
        myGraph.printGraph();

        System.out.println(myGraph.addEdge("C", "B"));
        System.out.println(myGraph.addEdge("D", "A"));
        System.out.println(myGraph.addEdge("D", "B"));
        System.out.println(myGraph.addEdge("D", "C"));
        myGraph.printGraph();

        System.out.println(myGraph.removeEdge("A", "B"));
        myGraph.printGraph();

        System.out.println(myGraph.removeEdge("A", "C"));
        myGraph.printGraph();

        System.out.println(myGraph.removeVertex("D"));
        myGraph.printGraph();
    }
}
