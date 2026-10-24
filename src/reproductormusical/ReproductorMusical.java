/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reproductormusical;

/**
 *
 * @author lusvi
 */

public class ReproductorMusical {

    public static void main(String[] args) {

        Multimedia primera = new Cancion("Cancion 1", 180, "Artista 1");
        Multimedia segunda = new Cancion("Cancion 2", 200, "Artista 2");
        Multimedia tercera = new Cancion("Cancion 3", 240, "Artista 3");

        primera.reproducir();
        segunda.reproducir();
        tercera.reproducir();
    }
}
