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
    private String optimalRoute;
    private double distance;
    private String pheromones;

    public Optimal(String optimalRoute, double distance, String pheromones) {
        this.optimalRoute = optimalRoute;
        this.distance = distance;
        this.pheromones = pheromones;
    }

    /**
     * @return the caminoOptimo
     */
    public String getCaminoOptimo() {
        return optimalRoute;
    }

    /**
     * @param caminoOptimo the caminoOptimo to set
     */
    public void setCaminoOptimo(String caminoOptimo) {
        this.optimalRoute = caminoOptimo;
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
