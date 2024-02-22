/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import EDD.*;

/**
 *
 * @author tomasaraujo
 */
public class HistoryTemp {
    private int numAnt;
    private String roadTraveled;
    private String lengthTraveled;

    public HistoryTemp(int numAnt, String roadTraveled, String lengthTraveled) {
        this.numAnt = numAnt;
        this.roadTraveled = roadTraveled;
        this.lengthTraveled = lengthTraveled;
    }

    public int getNumAnt() {
        return numAnt;
    }

    public void setNumAnt(int numAnt) {
        this.numAnt = numAnt;
    }

    public String getRoadTraveled() {
        return roadTraveled;
    }

    public void setRoadTraveled(String roadTraveled) {
        this.roadTraveled = roadTraveled;
    }

    public String getLengthTraveled() {
        return lengthTraveled;
    }

    public void setLengthTraveled(String lengthTraveled) {
        this.lengthTraveled = lengthTraveled;
    }

    @Override
    public String toString() {
        return "HistoryTemp{" + "numAnt=" + numAnt + ", roadTraveled=" + roadTraveled + ", lengthTraveled=" + lengthTraveled + '}';
    }
    
    
}
