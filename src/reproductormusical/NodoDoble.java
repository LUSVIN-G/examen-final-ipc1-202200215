/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reproductormusical;

/**
 *
 * @author lusvi
 */

public class NodoDoble {

    private Cancion cancion;
    private NodoDoble anterior;
    private NodoDoble siguiente;

    public NodoDoble(Cancion cancion) {
        this.cancion = cancion;
        this.anterior = null;
        this.siguiente = null;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }
}
