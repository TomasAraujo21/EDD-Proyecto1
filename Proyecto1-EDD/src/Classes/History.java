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
public class History {
    private int numAnt;
    private List recorridoHormiga;
    private List feromonasEnRecorrido;
    private double distanciaRecorrida;

    public History(List recorridoHormiga, List feromonasEnRecorrido, double distanciaRecorrida) {
        this.numAnt = 0;
        this.recorridoHormiga = recorridoHormiga;
        this.feromonasEnRecorrido = feromonasEnRecorrido;
        this.distanciaRecorrida = distanciaRecorrida;
    }

    
    
}
