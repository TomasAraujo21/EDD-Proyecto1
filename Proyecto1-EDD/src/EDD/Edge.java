/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Gabriel Flores
 */
public class Edge {
    private Vertex homeCity;
    private Vertex finalCity;
    private double distance;
    private double phermone;
    
    //Constructor de la clase Edge.

    public Edge(Vertex homeCity, Vertex finalCity, double distance, double phermone) {
        this.homeCity = homeCity;
        this.finalCity = finalCity;
        this.distance = distance;
        this.phermone = phermone;
    }
    
    //Getters y Setters de la clase Edge.

    public Vertex getHomeCity() {
        return homeCity;
    }

    public void setHomeCity(Vertex homeCity) {
        this.homeCity = homeCity;
    }

    public Vertex getFinalCity() {
        return finalCity;
    }

    public void setFinalCity(Vertex finalCity) {
        this.finalCity = finalCity;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getPhermone() {
        return phermone;
    }

    public void setPhermone(double phermone) {
        this.phermone = phermone;
    }

    
    
    
    
}
