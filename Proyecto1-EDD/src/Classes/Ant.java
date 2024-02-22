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
    private boolean arrived; // este atributo es para chequear si la hormiga llego a la ciudad destino indicada para completar el ciclo

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
    
    /**
     * @return the arrived
     */
    public boolean isArrived() {
        return arrived;
    }

    /**
     * @param arrived the arrived to set
     */
    public void setArrived(boolean arrived) {
        this.arrived = arrived;
    }
    
    public boolean visited(Vertex city) {
        // verificar que la ciudad que estoy pasando por parametro esta en la lista de ciudades recorridas de la hormiga
        Node pValue = new Node();
        pValue = pastCities.getpFirst();
        for (int i = 0; i < pastCities.getSize(); i++) {
            if (pValue.gettInfo() == city) {
                JOptionPane.showMessageDialog(null, "Esta ciudad ya ha sido visitada");
                pValue = pValue.getpNext();
                return true;
            }else{
                pValue = pValue.getpNext();
                return false;
            }
        }
        return false;
    }
    
    public void addPastCity(Vertex city) {
        // primero verifico que esa ciudad no esta en la lista de ciudades recorridas
        // si ya la visitó, no se hace nada. Usamos la funcion visited para eso
        if (visited(city)) {
            // CORREGIR ESTO
            JOptionPane.showMessageDialog(null, "La ciudad ya fue visitada");
        }else{
            this.setCity(city);
            this.pastCities.addEnd(city);
        }
    }
    
    public void visitCity(Vertex city, double dist) {
        // Primero verificamos que la ciudad que pasamos como parametro no haya sido visitada
        // Si no ha sido visitada, la agregamos a la lista de ciudades recorridas
        // Sumamos la distancia recorrida que actualmente += a la distancia que pasamos por parametro
        // Y por ulitmo hacemos un setCity (set ciudad actual) para actualizarla.
        if (visited(city)) {
            // CORREGIR ESTO
            JOptionPane.showMessageDialog(null, "La ciudad ya fue visitada");
        }else{
            this.pastCities.addEnd(city);
            this.distance += dist;
            this.setCity(city);
        }
    } 

    
}
