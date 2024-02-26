/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import EDD.*;
import javax.swing.*;

/**
 *
 * @author tomasaraujo
 */
public class Ant {

    private Vertex city;
    private List pastCities;
    private double distance;
    private boolean arrived;
    
    /**
     * Parametros necesarios para crear el constructor referente a la clase 'Ant'.
     * @param city
     *      Indica el vertice en donde se encuentra ubicada la hormiga.
     * @param pastCities
     *      Indica la lista de las ciudades visitadas por la hormiga.
     * @param distance
     *      Indica la distancia recorrida por la hormiga en un ciclo.
     */
    public Ant(Vertex city, List pastCities, double distance) {
        this.city = city;
        this.pastCities = pastCities;
        this.distance = distance;
    }

    public Ant() {
        this.city = null;
        this.pastCities = new List();
        this.distance = 0;
        this.arrived = false;
    }

    /**
     * @return the city
     */
    public Vertex getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(Vertex city) {
        this.city = city;
    }

    /**
     * @return the pastCities
     */
    public List getPastCities() {
        return pastCities;
    }

    /**
     * @param pastCities the pastCities to set
     */
    public void setPastCities(List pastCities) {
        this.pastCities = pastCities;
    }

    /**
     * @return the distance
     */
    public double getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }

    public boolean isArrived() {
        return arrived;
    }

    public void setArrived(boolean arrived) {
        this.arrived = arrived;
    }

    /**
     * Método para verificar si una ciudad ya ha sido previamente visitada.
     * 
     * @param city ciudad que queremos verificar
     * @return true: si la ciudad ha sido visitada
     *         false: si la ciudad no ha sido visitada
     */
    public boolean visited(Vertex city) {
        Node pValue = new Node();
        pValue = pastCities.getPfirst();
        for (int i = 0; i < pastCities.getSize(); i++) {
            if (pValue.gettInfo() == city) {
                JOptionPane.showMessageDialog(null, "Esta ciudad ya ha sido visitada");
                pValue = pValue.getpNext();
                return true;
            } else {
                pValue = pValue.getpNext();
                return false;
            }
        }
        return false;
    }
    
    /**
     * Método para agregar una ciudad a la lista de ciudades ya visitadas
     * 
     * @param city ciudad que queremos agregar a la lista de ciudades ya visitadas
     */

    public void addPastCity(Vertex city) {
        if (visited(city)) {

        } else {
            this.setCity(city);
            this.pastCities.addEnd(city);
        }
    }

    /**
     * Método para visitar una nueva ciudad
     * 
     * @param city ciudad a visitar
     * @param dist distancia a recorrer para visitar la ciudad
     */
    public void visitCity(Vertex city, double dist) {
        if (visited(city)) {
            
        } else {
            this.pastCities.addEnd(city);
            this.distance += dist;
            this.setCity(city);
        }
    }

}
