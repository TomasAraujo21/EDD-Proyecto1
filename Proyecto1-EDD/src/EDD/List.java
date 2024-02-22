/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Gabriel Flores
 */
public class List {
    //Atributos de la clase list.
    private Node pFirst;
    private int size;

    
    //Constructor de la clase list.
    public List() {
        this.pFirst = null;
        this.size = 0;
    }
    
    //GETTERS Y SETTERS de la clase List.
    
    public Node getpFirst() {
        return pFirst;
    }

    public void setpFirst(Node pfirst) {
        this.pFirst = pfirst;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    //Primitiva para verificar si la lista se encuentra vacia o no.
    public boolean isEmpty(){
        return this.pFirst == null;
    }
    
    //Primitiva para insertar al inicio de la lista.
    public void addStart(Object dato){
        Node pnew = new Node();
        pnew.settInfo(dato);       
        if (isEmpty()){
            pFirst = pnew;
        }else{
            pnew.setpNext(pFirst);
            pFirst = pnew;
        }
        size ++;
    }
    
    //Primitiva para insertar al final de la lista.
    public void addEnd(Object dato){
        Node pNew = new Node(dato);
        if (isEmpty()){
            pFirst = pNew;
        }else{
            Node aux = pFirst;
            while(aux.getpNext()!= null){
                aux = aux.getpNext();
            }
            aux.setpNext(pNew);
        }
        size++;
    }
    
    //Primitiva insetar por posicion indicada.
    public void addByPosition(int position,Object dato){
        if (position >= 0 && position <= size){
            Node pNew = new Node();
            pNew.settInfo(dato);
            if (position ==0){
                pNew.settInfo(pFirst);
                pFirst = pNew;
            } else{
                if (position == size){
                    Node aux = pFirst;
                    while (aux.getpNext() != null){
                        aux.getpNext();
                    }
                    aux.setpNext(pNew);
                }else{
                    Node aux = pFirst;
                    for (int i=0;i<(position - 1);i++){
                        aux = aux.getpNext();
                    }
                    Node nextOne = aux.getpNext();
                    aux.setpNext(pNew);
                    pNew.setpNext(nextOne);
                }
            }
            size ++;
        }
    }
    
    //Primitiva obtener el valor dentro d eun nodo.
    public Object getValor(int index) {
        if (isEmpty()) {
            return -1;
        } else {
            Node pointer = getpFirst();
            int cont = 0;
            while (cont < index && pointer.getpNext() != null) {
                pointer = pointer.getpNext();
                cont++;
            }
            return pointer.gettInfo();
        }
    }
    
    //Primitiva mostrar los elementos de una lista.
    public void show() {
        if(!isEmpty()){
            Node pointer = getpFirst();
            while(pointer!=null){
            System.out.println("["+pointer.gettInfo()+"]");
            pointer = pointer.getpNext();
            }
        }else{
            System.out.println("La lista se encuentra aun vacia.");
        }
    }
    
    //Primitva para eliminar al inicio de una lista simple.
    public boolean deleteStart(){
        if(!isEmpty()){
            pFirst = pFirst.getpNext();
            size--;
            return true;
        }else{
            return false;
        }
    }
    
    //Primitiva para eliminar al final de una lista simple.
    public void deleteFinal(){
        if (!isEmpty()){
            Node pointer = getpFirst();
            while (pointer.getpNext() != null){
                pointer = pointer.getpNext();
            }
            pointer.setpNext(null);
            size --;
        }
    }
    
    public boolean find(Object reference){
        Node aux = pFirst;
        boolean find = false;
        while(aux != null && find != true){
            if (reference == aux.gettInfo()){ 
                find = true;
            }
            else{
                aux = aux.getpNext();
            }
        }
        return find;
    }
    
    public void deleteByReference(Object reference){
        if (find(reference)) {
            if (pFirst.gettInfo() == reference) {
                pFirst = pFirst.getpNext();
            } else{
                Node aux = pFirst;
                while(aux.getpNext().gettInfo() != reference){
                    aux = aux.getpNext();
                }
                Node nextAux = aux.getpNext().getpNext();
                aux.setpNext(nextAux);  
            }
            size--;
        }
    }
    
    public String transform(){
        if(!isEmpty()){
            Node aux = pFirst;
            String expression = "";
            for (int i = 0; i < size; i++) {
                expression += aux.gettInfo().toString() + "\n";
                aux = aux.getpNext();
            }
            return expression;
        }
        return "Lista vacia";
    }
    public void clear(){
        pFirst = null;
        size = 0;
    }
}

