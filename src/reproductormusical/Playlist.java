/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reproductormusical;

/**
 *
 * @author lusvi
 */


public class Playlist {

    private NodoDoble cabeza;
    private NodoDoble cola;
    private NodoDoble actual;
    private int tamanio;

    public Playlist() {
        cabeza = null;
        cola = null;
        actual = null;
        tamanio = 0;
    }

    public void agregarCancion(Cancion cancion) {

        NodoDoble nuevo = new NodoDoble(cancion);

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            actual = nuevo;
        } else {
            nuevo.setAnterior(cola);
            cola.setSiguiente(nuevo);
            cola = nuevo;
        }

        tamanio++;
    }

    public void mostrarPlaylist() {

        if (cabeza == null) {
            System.out.println("No hay canciones en la lista.");
        } else {

            NodoDoble recorrido = cabeza;

            System.out.println("Canciones de la playlist:");

            while (recorrido != null) {
                System.out.println(recorrido.getCancion().getTitulo());
                recorrido = recorrido.getSiguiente();
            }
        }
    }
    
public void siguiente() {

    if (actual == null) {
        System.out.println("La lista esta vacia.");
    } else if (actual.getSiguiente() != null) {
        actual = actual.getSiguiente();
        actual.getCancion().reproducir();
    } else {
        System.out.println("Ya estas en la ultima cancion.");
    }
}

public void anterior() {

    if (actual == null) {
        System.out.println("La lista esta vacia.");
    } else if (actual.getAnterior() != null) {
        actual = actual.getAnterior();
        actual.getCancion().reproducir();
    } else {
        System.out.println("Ya estas en la primera cancion.");
    }
}


public void eliminarActual() {

    if (actual == null) {
        System.out.println("No hay ninguna cancion para eliminar.");
        return;
    }

    NodoDoble borrar = actual;

    if (cabeza == cola) {
        cabeza = null;
        cola = null;
        actual = null;

    } else if (actual == cabeza) {
        cabeza = cabeza.getSiguiente();
        cabeza.setAnterior(null);
        actual = cabeza;

    } else if (actual == cola) {
        cola = cola.getAnterior();
        cola.setSiguiente(null);
        actual = cola;

    } else {
        NodoDoble izquierda = actual.getAnterior();
        NodoDoble derecha = actual.getSiguiente();

        izquierda.setSiguiente(derecha);
        derecha.setAnterior(izquierda);

        actual = derecha;
    }

    borrar.setAnterior(null);
    borrar.setSiguiente(null);

    tamanio--;

    System.out.println("Se elimino la cancion correctamente.");
}

}

