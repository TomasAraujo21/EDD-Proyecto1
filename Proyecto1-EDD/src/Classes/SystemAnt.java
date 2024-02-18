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
public class SystemAnt {
    // AQUI VA TODA LA INFO QUE SI ALPHA, BETA, Y ESO.
    // LAS PRIMITIVAS VAN A SER, ACTUALIZAR LOS CICLOS, EVPARORAR FEROMONAS, ACTUALIZAR FEROMONAS.
    
    private List ants;
    private double rho;
    private double alpha;
    private double beta;
    private Vertex startCity;
    private Vertex endCity;
    private Graph graph;
    private String optimalRoute;
    private String pheromones;
    private double optimalDistance;
    private List history;       // EN EL HISTORIAL GUARDO LOS OBJETOS DE TIPO OPTIMO

    public SystemAnt(List ants, double rho, double alpha, double beta, Vertex startCity, Vertex endCity, Graph graph) {
        this.ants = ants;
        this.alpha = alpha;
        this.beta = beta;
        this.startCity = startCity;
        this.endCity = endCity;
        this.graph = graph;
        this.optimalRoute = "";
        this.pheromones = "";
        this.optimalDistance = 0; 
        this.history = new List();
    }
    
    // HACER TODOS LOS GETTER Y SETTER PARA LOS PARAMETROS
    
    /**
     * @return the ants
     */
    public List getAnts() {
        return ants;
    }

    /**
     * @param ants the ants to set
     */
    public void setAnts(List ants) {
        this.ants = ants;
    }

    /**
     * @return the rho
     */
    public double getRho() {
        return rho;
    }

    /**
     * @param rho the rho to set
     */
    public void setRho(double rho) {
        this.rho = rho;
    }

    /**
     * @return the alpha
     */
    public double getAlpha() {
        return alpha;
    }

    /**
     * @param alpha the alpha to set
     */
    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    /**
     * @return the beta
     */
    public double getBeta() {
        return beta;
    }

    /**
     * @param beta the beta to set
     */
    public void setBeta(double beta) {
        this.beta = beta;
    }

    /**
     * @return the startCity
     */
    public Vertex getStartCity() {
        return startCity;
    }

    /**
     * @param startCity the startCity to set
     */
    public void setStartCity(Vertex startCity) {
        this.startCity = startCity;
    }

    /**
     * @return the endCity
     */
    public Vertex getEndCity() {
        return endCity;
    }

    /**
     * @param endCity the endCity to set
     */
    public void setEndCity(Vertex endCity) {
        this.endCity = endCity;
    }

    /**
     * @return the graph
     */
    public Graph getGraph() {
        return graph;
    }

    /**
     * @param graph the graph to set
     */
    public void setGraph(Graph graph) {
        this.graph = graph;
    }

    /**
     * @return the optimalRoute
     */
    public String getOptimalRoute() {
        return optimalRoute;
    }

    /**
     * @param optimalRoute the optimalRoute to set
     */
    public void setOptimalRoute(String optimalRoute) {
        this.optimalRoute = optimalRoute;
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

    /**
     * @return the history
     */
    public List getHistory() {
        return history;
    }

    /**
     * @param history the history to set
     */
    public void setHistory(List history) {
        this.history = history;
    }
    
    // Primero debemos hacer una verificacion que el grafo exista, porque sin grafo no hay ningun sistema
    public boolean GraphExists(Graph grpah) {
        
        return false;
    }
    
    
    // Como la distancia se inicializa en cero, para el ciclo 1 no debemos comparar con nuestro atributo distanciaOptima
    
    private void runSystems() {
        
    }
    
//    public Vertex decideNextCity(Ant h) {
//        Vertex ciudadHormiga = h.getCity();
//        List probabilidades = new List();
//        
//        double sumaProbabilidades = 0.0;
//        for (int i = 0; i < ciudadHormiga.getListAdy().getSize(); i++) {
//            Edge edge = (Edge) ciudadHormiga.getListAdy().getValor(i);
//            Vertex destino = edge.getFinalCity();
//            if (!hVisited(destino)) {
//                int p = (edge.getFeromonas) **1 * (edge.getDistance())**2;
//                sumaProbabilidades += p;    // despues se multiplica con la lista
//            }
//        }
//    } 
    
//    private void mover(Ant h) {
//        // SE VAN A MOVER POR TODO EL GRAFO HASTA QUE LLEGUEN A LA CIUDAD FINAL 
//        for (int i = 0; i < graph; i++) {
//            if (h.getCity() != endCity) {
//                // DECIDO A DONDE MOVERME (esto retorna una ciudad)
//                // h.vistCity(ciudad retornada antes, distancia)
//            }else{
//                break;
//            }
//        }
//    }
}
