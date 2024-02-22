/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import javax.swing.JOptionPane;

/**
 *
 * @author GAbriel Flores
 * 
 */
public class Vertex {
    private int numCity;
    private List listAdy;

    //Constructor de la clase Vertex(Vertice).
    public Vertex(int numCity, List listAdy) {
        this.numCity = numCity;
        this.listAdy = listAdy;
    }
    
    public Vertex(int numCity) {
        this.numCity = numCity;
        this.listAdy = new List();
    }

    //Getters and Setters de la clase Vertex.
    public int getNumCity() {
        return numCity;
    }

    public void setNumCity(int numCity) {
        this.numCity = numCity;
    }

    public List getListAdy() {
        return listAdy;
    }

    public void setListAdy(List listAdy) {
        this.listAdy = listAdy;
    }
    
    //Primitva para agregar una Arista.
    public void addEdges(Edge edge){
       switch (findEdge(edge)){
           case 0 -> listAdy.addEnd(edge);
           case 1 -> JOptionPane.showMessageDialog(null, "La arista ya existe");
           default -> JOptionPane.showMessageDialog(null, "La arista no es valida");
       }
    }
    
    //Primitva para eliminar una Arista.
    public void deleteEdge(Edge edge){
        switch (findEdge(edge)){
           case 0 -> listAdy.deleteStart();
           case 1 -> JOptionPane.showMessageDialog(null, "La arista ya existe");
           default -> JOptionPane.showMessageDialog(null, "La arista no es valida");
        }
    }
    
    //Primitiva para determinar si una Arista existe o no.
    public int findEdge(Edge edge){
        if(edge.getHomeCity().getNumCity()==numCity){
            for(int i = 0; i < listAdy.getSize();i++){
                Edge edgeAux= (Edge) listAdy.getValor(i);
                if(edgeAux.getFinalCity().getNumCity()== edge.getFinalCity().getNumCity()){
                    return 1;
                }    
            }
            return -1;
        }else{
            return 0;
        } 
    }
    
    public Edge findEdge2(int numCity){
        for (int i = 0; i < listAdy.getSize(); i++) {
            Edge edgeAux = (Edge) listAdy.getValor(i);
            if(edgeAux.getFinalCity().getNumCity() == numCity){
                return edgeAux;
            }
        }
        return null;
    }
    
    public double findDistance(int numCity) {
        for (int i = 0; i < listAdy.getSize(); i++) {
            Edge edge = (Edge) listAdy.getValor(i);
            if (edge.getFinalCity().getNumCity() == numCity) {
                return edge.getDistance();
            }
        }
        return 0;
    }
}
