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
}

