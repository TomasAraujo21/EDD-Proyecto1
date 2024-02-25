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
import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class GraphFunc {
    public Graph convertString(String txt) {
        String[] lines = txt.split("\n");
        System.out.println(Arrays.toString(lines));
        Graph graph = new Graph();
        List cities = new List();

        boolean isVertex = true;

        for (String line : lines) {
            if (line.equals("aristas")) {
                isVertex = false;
                continue;
            }

            if (isVertex) {
                if (!line.equals("ciudad")) {
                    int vertex = Integer.parseInt(line);
                    Vertex v = new Vertex(vertex);
                    cities.addEnd(v);
                }
            } else {
                String[] partes = line.split(",");
                int origin = Integer.parseInt(partes[0]);
                int destiny = Integer.parseInt(partes[1]);
                double weight = Double.parseDouble(partes[2]);

                Vertex city1 = searchVertex(origin, cities);
                Vertex city2 = searchVertex(destiny, cities);
                city1.getListAdy().addEnd(new Edge(city1, city2, weight));
                city2.getListAdy().addEnd(new Edge(city2, city1, weight));
            }
        }

        graph.setCities(cities);

        return graph;
    }
//      public static void main(String[] args) {
//        String filePath = "datos.txt"; // Cambia esto al path correcto de tu archivo
//
//        List<String> ciudadData = new ArrayList<>();
//        List<String> aristasData = new ArrayList<>();
//
//        try {
//            readData(filePath, ciudadData, aristasData);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // Mostrar datos leídos
//        System.out.println("Datos de la ciudad:");
//        for (String line : ciudadData) {
//            System.out.println(line);
//        }
//
//        System.out.println("Aristas:");
//        for (String line : aristasData) {
//            System.out.println(line);
//        }
//    }

   
    
    public Graph convertStringPh(String txt) {
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
    
    public void deleteCity(Graph grafo, int numVertex){
        for (int i = 0; i < grafo.getCities().getSize(); i++) {
            Vertex currentVertex = (Vertex) grafo.getCities().getValor(i);
            for (int j = 0; j < currentVertex.getListAdy().getSize(); j++) {
               Edge currentEdge = (Edge) currentVertex.getListAdy().getValor(j);
               if(currentEdge.getFinalCity().getNumCity() == numVertex){
                   currentVertex.deleteEdge(currentEdge);
               }
            }
        }
        
        grafo.deleteCity(grafo.findCity2(numVertex));
    
    }
}
