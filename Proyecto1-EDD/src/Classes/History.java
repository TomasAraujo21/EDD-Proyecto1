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

    public History(String title, String antTrail, String optimalRoad, double optimalDistance) {
        this.title = title;
        this.antTrail = antTrail;
        this.optimalRoad = optimalRoad;
        this.optimalDistance = optimalDistance;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAntTrail() {
        return antTrail;
    }

    public void setAntTrail(String antTrail) {
        this.antTrail = antTrail;
    }

    public String getOptimalRoad() {
        return optimalRoad;
    }

    public void setOptimalRoad(String optimalRoad) {
        this.optimalRoad = optimalRoad;
    }

    public double getOptimalDistance() {
        return optimalDistance;
    }

    public void setOptimalDistance(double optimalDistance) {
        this.optimalDistance = optimalDistance;
    }
    
    
}