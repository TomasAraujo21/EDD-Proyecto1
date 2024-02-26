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

    private List ants;
    private double q;
    private double alpha;
    private double beta;
    private double rho;
    private Vertex startCity;
    private Vertex endCity;
    private Graph graph;
    private String optimalRouteS;
    private String pheromones;
    private double optimalDistance;
    private List optimalRoute;
    private List history;       
    private List tempHistory;
    private int cycles;

    
    /**
     * COnstructro de la clase 'SystemAnt'
     * 
     * @param ants
     * @param rho
     * @param alpha
     * @param beta
     * @param startCity
     * @param endCity
     * @param graph
     * @param cycles 
     */
    public SystemAnt(List ants, double rho, double alpha, double beta, Vertex startCity, Vertex endCity, Graph graph, int cycles) {
        this.ants = ants;
        this.alpha = alpha;
        this.beta = beta;
        this.startCity = startCity;
        this.endCity = endCity;
        this.graph = graph;
        this.optimalRouteS = "";
        this.pheromones = "";
        this.optimalDistance = 0;
        this.history = new List();
        this.tempHistory = new List();
        this.cycles = cycles;
        this.optimalRoute = new List();
        this.rho = rho;
    }
      
  
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
        return q;
    }

    /**
     * @param rho the rho to set
     */
    public void setRho(double rho) {
        this.q = rho;
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

    public double getQ() {
        return q;
    }

    public void setQ(double q) {
        this.q = q;
    }

    public String getOptimalRouteS() {
        return optimalRouteS;
    }

    public void setOptimalRouteS(String optimalRouteS) {
        this.optimalRouteS = optimalRouteS;
    }

    public List getOptimalRoute() {
        return optimalRoute;
    }

    public void setOptimalRoute(List optimalRoute) {
        this.optimalRoute = optimalRoute;
    }

    public List getTempHistory() {
        return tempHistory;
    }

    public void setTempHistory(List tempHistory) {
        this.tempHistory = tempHistory;
    }

    public int getCycles() {
        return cycles;
    }

    /**
     * @return the optimalRoute
     */
    public void setCycles(int cycles) {    
        this.cycles = cycles;
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

    
    /**
     * Método para inicializar el sistema
     */
    public void runSystem() {
        for (int i = 0; i < cycles; i++) {
            for (int j = 0; j < ants.getSize(); j++) {
                Ant ant = new Ant();
                fullCycle(ant);
                HistoryTemp temp = new HistoryTemp(j, ant.getPastCities().toString(), Double.toString(ant.getDistance()));
                tempHistory.addEnd(temp);
            }
            String cycle = "Ciclo" + (i +1 );
            History hist = new History(cycle, tempHistory.toString(), optimalRoute.transformCity(), optimalDistance);
            history.addEnd(hist);
            evaporatePheromones();
            resetAnts();
            tempHistory.clear();
        }

    }

    
    /**
     * Método para realizar un ciclo del sistema
     * 
     * @param ant la hormiga a realizar el ciclo
     */
    public void fullCycle(Ant ant) {
        for (int i = 0; i < graph.getCities().getSize(); i++) {
            if (ant.getCity() != endCity) {
                List possibleCities = getPossibleCity(ant);
                if (!possibleCities.isEmpty()) {
                    List odds = chances(possibleCities);
                    Vertex nextCity = decideNextCity(possibleCities, odds);
                    ant.visitCity(nextCity, nextCity.findDistance(nextCity.getNumCity()));
                }else{
                    break;
                } 
            } else {
                ant.setArrived(true);
                break;
            }
        }
        if (optimalDistance == 0) {
            this.setOptimalDistance(ant.getDistance());
            this.setOptimalRouteS(ant.getPastCities().toString());
        }else{
            if (ant.getDistance() < this.getOptimalDistance() && ant.getCity().getNumCity() == this.startCity.getNumCity()) {
                this.setOptimalDistance(ant.getDistance());
                this.setOptimalRouteS(ant.getPastCities().toString());
            }
        }
    }
    
    /**
     * Método para resetear los atributos de las hormigas
     */
    public void resetAnts() {
        for (int i = 0; i < ants.getSize(); i++) {
            Ant ant = (Ant) ants.getValor(i);
            ant.setDistance(0);
            ant.getPastCities().clear();
            ant.setCity(startCity);
        }
    }

    /**
     * Método para obtener una lista de ciudades candidatas a la cual la gormiga se puede mover
     * 
     * @param ant la hormiga mover
     * @return possibleCities: lista de ciudades candidatas
     */
    public List getPossibleCity(Ant ant) {
        Vertex city = ant.getCity();
        List possibleCities = new List();
        for (int i = 0; i < city.getListAdy().getSize(); i++) {
            Edge edge = (Edge) city.getListAdy().getValor(i);
            if (ant.visited(edge.getFinalCity())) {
                possibleCities.addEnd(edge);
            }
        }
        return possibleCities;
    }

    /**
     * Método donde se emplea la fórmula para calcular las probabilidades de moverse a una ciudad u otra
     * 
     * @param possibleCities la lista de ciudades candidatas a visitar
     * @return odds: las probabildiades de visitar la ciudad
     */
    public List chances(List possibleCities) {
        List odds = new List();
        double sumOdds = 0.0;
        for (int i = 0; i < possibleCities.getSize(); i++) {
            Edge edge = (Edge) possibleCities.getValor(i);
            double tau = Math.pow(edge.getPheromones(), this.alpha);
            double eta = Math.pow(q / edge.getDistance(), this.beta);
            double chances = tau * eta;
            odds.addEnd(chances);
            sumOdds += chances;
        }
        return odds;
    }

    /**
     * Método para decidir que ciudad va a visitar la hormiga
     * 
     * @param possibleCities lista de posibles ciudades
     * @param odds probabilidad de visitar la ciudad
     * @return retornar la ciudad a visitar
     */
    public Vertex decideNextCity(List possibleCities, List odds) {
        int position = -1;
        double bestOdd = 0.0;
        for (int i = 0; i < odds.getSize(); i++) {
            if (i == 0) {
                position = i;
                bestOdd = (double) odds.getValor(i);
            } else {
                double probabilidadActual = (double) odds.getValor(i);
                if (probabilidadActual > bestOdd) {
                    position = i;
                    bestOdd = (double) odds.getValor(i);
                }
            }
        }
        Edge finalEdge = (Edge) possibleCities.getValor(position);
        return finalEdge.getFinalCity();
    }

    
    /**
     * Método para actualizar las feromonas de una arista cuando una homriga pasa por ella
     * 
     * @param ant hromiga que contribuirá al cambio de feromonas
     */
    public void updatePheromones(Ant ant) {
        double cont = q/ant.getDistance();
        for (int i = 0; i < ant.getPastCities().getSize()-1; i++) {
            Vertex city = (Vertex) ant.getPastCities().getValor(i);
            Vertex nextCity = (Vertex) ant.getPastCities().getValor(i+1);
            
            double pheromones = cont + city.findEdge2(nextCity.getNumCity()).getPheromones();
            city.findEdge2(nextCity.getNumCity()).setPheromones(pheromones);
        }
    }

    
    /**
     * Método para evaporar las feromonas
     */
    public void evaporatePheromones() {
        for (int i = 0; i < graph.getCities().getSize(); i++) {
            Vertex currentCity = (Vertex) graph.getCities().getValor(i);
            for (int j = 0; j < currentCity.getListAdy().getSize(); j++) {
                Edge currentEdge = (Edge) currentCity.getListAdy().getValor(j);
                double evppheromones = (1-rho)*currentEdge.getPheromones();
                currentEdge.setPheromones(evppheromones);
            }
        }
    }
}
