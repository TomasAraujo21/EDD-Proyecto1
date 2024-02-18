/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author tomasaraujo
 */
public class Optimal {
    private String caminoOptimo;
    private double distance;
    private String pheromones;

    public Optimal(String caminoOptimo, double distance, String pheromones) {
        this.caminoOptimo = caminoOptimo;
        this.distance = distance;
        this.pheromones = pheromones;
    }

    /**
     * @return the caminoOptimo
     */
    public String getCaminoOptimo() {
        return caminoOptimo;
    }

    /**
     * @param caminoOptimo the caminoOptimo to set
     */
    public void setCaminoOptimo(String caminoOptimo) {
        this.caminoOptimo = caminoOptimo;
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
     * @return the pheromones
     */
    public String getPheromones() {
        return pheromones;
    }

    /**
     * @param pheromones the pheromones to set
     */
    public void setPheromones(String pheromones) {
        this.pheromones = pheromones;
    }
    
    
}
