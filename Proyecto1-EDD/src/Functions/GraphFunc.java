/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

/**
 *
 * @author tomasaraujo
 */

import EDD.*;
import java.util.Arrays;

public class GraphFunc {
    public Graph convertString(String txt) {
        String[] lines = txt.split("\n");
        System.out.println(Arrays.toString(lines));
        Graph graph = new Graph();
        List vertices = new List();

        boolean isVertex = true;

        for (String line : lines) {
            if (line.equals("aristas")) {
                isVertex = false;
                continue;
            }

            if (isVertex) {
                if (!line.equals("ciudad")) {
                    int vertice = Integer.parseInt(line);
                    Vertex v = new Vertex(vertice);
                    vertices.addEnd(v);
                }
            } else {
                String[] partes = line.split(",");
                int origin = Integer.parseInt(partes[0]);
                int destiny = Integer.parseInt(partes[1]);
                double weight = Double.parseDouble(partes[2]);
                double phermones = Double.parseDouble(partes[3]);

                Vertex city1 = searchVertex(origin, vertices);
                Vertex city2 = searchVertex(destiny, vertices);
                city1.getListAdy().addEnd(new Edge(city1, city2, weight,phermones));
                city2.getListAdy().addEnd(new Edge(city2, city1, weight,phermones));
            }
        }

        graph.setCities(vertices);

        return graph;
    }
    
    public Vertex searchVertex(int num, List vertices) {
        if (!vertices.isEmpty()) {
            for (int i = 0; i < vertices.getSize(); i++) {
                Vertex v = (Vertex) vertices.getValor(i);
                if (v.getNumCity() == num) {
                    return v;
                }
            }
            return null;
        }
        return null;
    }
    
}
