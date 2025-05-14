package datastructures.graph;

public class Main {
    public static void main(String[] args) {
        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.printGraph();

        System.out.println(myGraph.addEdge("A", "B"));
        System.out.println(myGraph.addEdge("A", "D"));
        System.out.println(myGraph.addEdge("M", "D"));
        myGraph.printGraph();

        System.out.println(myGraph.addEdge("C", "B"));
        myGraph.printGraph();

        System.out.println(myGraph.removeEdge("A", "B"));
        myGraph.printGraph();

        System.out.println(myGraph.removeEdge("A", "C"));
        myGraph.printGraph();
    }
}
