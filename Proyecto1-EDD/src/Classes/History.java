/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import EDD.*;

/**
 *
 * @author Gabriel Flores
 */
public class History {
    private String title;
    private String antTrail;
    private String optimalRoad;
    private double optimalDistance;
    
    
    /**
     * Constructor de la clase 'History'
     * 
     * @param title
     * @param antTrail
     * @param optimalRoad
     * @param optimalDistance 
     */
    public History(String title, String antTrail, String optimalRoad, double optimalDistance) {
        this.title = title;
        this.antTrail = antTrail;
        this.optimalRoad = optimalRoad;
        this.optimalDistance = optimalDistance;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the antTrail
     */
    public String getAntTrail() {
        return antTrail;
    }

    /**
     * @param antTrail the antTrail to set
     */
    public void setAntTrail(String antTrail) {
        this.antTrail = antTrail;
    }

    /**
     * @return the optimalRoad
     */
    public String getOptimalRoad() {
        return optimalRoad;
    }

    /**
     * @param optimalRoad the optimalRoad to set
     */
    public void setOptimalRoad(String optimalRoad) {
        this.optimalRoad = optimalRoad;
    }

    /**
     * @return the optimalDistance
     */
    public double getOptimalDistance() {
        return optimalDistance;
    }

    /**
     * @param optimalDistance the optimalDistance to set
     */
    public void setOptimalDistance(double optimalDistance) {
        this.optimalDistance = optimalDistance;
    }
    
    
}