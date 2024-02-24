/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;
import EDD.*;
import Classes.*;
/**
 *
 * @author Gabriel Flores
 */
public class SystemFunc {
    // AQUI VA LA FUNCION DE INICIALIZAR FEROMONAS
    
    
    public void startPheromones(Graph graph) {
        double Initialpheromones = 1/graph.getCities().getSize();
        for (int i = 0; i < graph.getCities().getSize(); i++) {
            Vertex city = (Vertex) graph.getCities().getValor(i);
            for (int j = 0; j < city.getListAdy().getSize(); j++) {
                Edge edge = (Edge) city.getListAdy().getValor(j);
                edge.setPheromones(Initialpheromones);
            }
        }
    }
    
    public List startAnts(int num, Vertex city) {
        //  ESTO REPRESENTA LA CANTIDAD DE HORMIGAS QUE DIJO EL USUARIO QUE QUIERE EN EL SISTEMA
        List ants = new List();
        for (int i = 0; i < num; i++) {
            Ant ant = new Ant();
            ant.setCity(city);
            ants.addEnd(ant);
        }
        return ants;
    }
    
    
}
