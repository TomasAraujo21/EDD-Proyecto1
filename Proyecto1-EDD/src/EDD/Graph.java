/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Flores
 */
public class Graph {
    
    private List cities;

    //Constructor de la clase Graph.
    public Graph() {
        this.cities = new List();
    }

    public List getCities() {
        return cities;
    }

    public void setCities(List cities) {
        this.cities = cities;
    }
    
    //Primitiva para agregar un vertice al grafo.
    public void addCity(Vertex vertex){
        if(!findCity(vertex)){
            cities.addEnd(vertex);
            JOptionPane.showMessageDialog(null, "El vertice se ha agregado correctamente!");
        }else{
            JOptionPane.showMessageDialog(null, "El vertice ya se encuentra en la lista!");
        }
    }
    public void addRoad(Edge edge){
        if(findRoad(edge)==false){
            for(int i=0;i<cities.getSize();i++){
                Vertex vertexAux = (Vertex) cities.getValor(i);
                if(vertexAux.getNumCity()==edge.getHomeCity().getNumCity()){
                    vertexAux.getListAdy().addEnd(edge);
                }else if(vertexAux.getNumCity()==edge.getFinalCity().getNumCity()){
                    Edge edgeAux = new Edge(vertexAux, edge.getHomeCity(),edge.getDistance());
                    vertexAux.getListAdy().addEnd(edgeAux);
                }else{
                    JOptionPane.showConfirmDialog(null, "La arista ya se encuentra en el grafo!");
                }
            }
            JOptionPane.showConfirmDialog(null, "La arista ha sido agregada!");
        }
    }
    
    public boolean findCity(Vertex vertex){
        int numVer = vertex.getNumCity();
        for(int i = 0; i < cities.getSize(); i++){
            Vertex vertexAux =(Vertex) cities.getValor(i);
            if(vertexAux.getNumCity()== numVer){
                return true;
            }
        }
        return false;
    }
    
    
    public boolean findRoad(Edge edge){
        for(int i =0;i<cities.getSize();i++){
            Vertex vertexAux = (Vertex) cities.getValor(i);
            if(vertexAux.findEdge(edge)==1){
                return true;
            }
        }
        return false;
    }
    
    public int numberCities(){
        return cities.getSize();
    }
    
    public void deleteCity(Vertex vertex){
        if(findCity(vertex)==true){
            int numRef = vertex.getNumCity();
            cities.deleteByReference(numRef);
            JOptionPane.showMessageDialog(null, "El vertice ha sido eliminado correctamente!");
        }else{
            JOptionPane.showMessageDialog(null, "El vertice no se encuentra en la lista!");
        }
    }
    public void deleteRoad(Edge edge){
        if(findRoad(edge)==true){
            for(int i=0;i<cities.getSize();i++){
                Vertex vertexAux = (Vertex) cities.getValor(i);
                if(vertexAux.getNumCity()==edge.getHomeCity().getNumCity()){
                    vertexAux.getListAdy().deleteByReference(vertexAux.getNumCity());
                }else if(vertexAux.getNumCity()==edge.getFinalCity().getNumCity()){
                    Edge edgeAux = new Edge(vertexAux, edge.getHomeCity(),edge.getDistance());
                    vertexAux.getListAdy().deleteByReference(edgeAux);
                }else{
                    JOptionPane.showConfirmDialog(null, "La arista no existe en el grafo!");
                }
            }
            JOptionPane.showConfirmDialog(null,"La arista ha sido eliminada!");
        }
    }
    public boolean isEmpty(){
        return cities.getPfirst()==null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ciudaddes:\n");
        for(int i =0; i<cities.getSize();i++){
            Vertex vertexAux = (Vertex) cities.getValor(i);
            sb.append(vertexAux.getNumCity()).append("\n");
        }
        sb.append("Aristas:\n");
        for(int i =0; i<cities.getSize();i++){
            Vertex vertexAux = (Vertex) cities.getValor(i);
            for(int j=0; j<vertexAux.getListAdy().getSize();j++){
                Edge edgeAux = (Edge) vertexAux.getListAdy().getValor(j);
                if(edgeAux.getFinalCity().getNumCity()> vertexAux.getNumCity()){
                    sb.append(edgeAux.getHomeCity().getNumCity()).append(",").append(edgeAux.getFinalCity().getNumCity()).append(",").append(edgeAux.getDistance()).append("\n");
//                    sb.append(arista.getOrigen().getNumCiudad()).append(" ,").append(arista.getDestino().getNumCiudad()).append(" ,").append(arista.getDistancia()).append("\n")
                }
            }
        }
        return sb.toString();
    }  
}
