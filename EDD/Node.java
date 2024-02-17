/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author tomasaraujo
 */
public class Node {
    //Atributos de la clase Node.
    private Object tInfo;
    private Node  pNext;

    //Constructor de la clase Node.
    public Node() {
        this.tInfo = null;
        this.pNext = null;
    }

    //GETTERS Y SETTERS de la clase Node.
    public Object gettInfo() {
        return tInfo;
    }

    public void settInfo(Object tInfo) {
        this.tInfo = tInfo;
    }

    public Node getpNext() {
        return pNext;
    }

    public void setpNext(Node pNext) {
        this.pNext = pNext;
    }
    
    
    
    
    
}