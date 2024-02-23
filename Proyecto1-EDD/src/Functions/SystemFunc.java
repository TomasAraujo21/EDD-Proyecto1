/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;
import EDD.*;
import Classes.*;
/**
 *
 * @author tomasaraujo
 */
public class SystemFunc {
    // AQUI VA LA FUNCION DE INICIALIZAR FEROMONAS
    
    
//    public List startPheromones(Graph graph) {
//        double pheromones = 1/graph.getNumVertices();
//        for (int i = 0; i < graph.getNumVertices(); i++) {
//        }
//    }
    
    public List Ants(int num, Vertex city) {
        //  ESTO REPRESENTA LA CANTIDAD DE HORMIGAS QUE DIJO EL USUARIO QUE QUIERE EN EL SISTEMA
        List ants = new List();
        for (int i = 0; i < num; i++) {
            Ant h = new Ant();
            h.setCity(city);
            ants.addEnd(h);
        }
        return ants;
    }
    
    public List ants(int numAnts, Vertex city) {
        List listAnts = new List();
        for (int i = 0; i < numAnts; i++) {
            Ant ant = new Ant();
            ant.setCity(city);
            listAnts.addEnd(ant);
        }
        return listAnts;
    }
    
    public void startPheromones(Graph graph) {
        double startPheromone = 1/graph.getCities().getSize();
        for (int i = 0; i < graph.getCities().getSize(); i++) {
            Vertex vertexAux = (Vertex) graph.getCities().getValor(i);
            for (int j = 0; j < vertexAux.getListAdy().getSize(); j++) {
                Edge aristaActual = (Edge) vertexAux.getListAdy().getValor(i);
                aristaActual.setPheromones(startPheromone);
            }
        }
    }
    
    
}
