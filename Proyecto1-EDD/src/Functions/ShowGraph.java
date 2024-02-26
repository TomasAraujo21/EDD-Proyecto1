/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

/**
 *
 * @author Christian
 */
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;

public class ShowGraph {

    public void showGraph() {
        // Create a new graph
        Graph graph = new SingleGraph("Grafo");

        // Set the graph's auto-create mode to true
        graph.setAutoCreate(true);

        // Add nodes and edges
        Node node1 = graph.addNode("A");
        Node node2 = graph.addNode("B");
        Node node3 = graph.addNode("C");
        graph.addEdge("AB", "A", "B");
        graph.addEdge("BC", "B", "C");

        // Display the graph
        Viewer viewer = graph.display();

        // Customize the node colors and sizes
        node1.setAttribute("ui.style", "fill-color: red; size: 50px;");
        node2.setAttribute("ui.style", "fill-color: green; size: 50px;");
        node3.setAttribute("ui.style", "fill-color: blue; size: 50px;");
    }
}