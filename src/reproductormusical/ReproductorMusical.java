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

        Cancion primera = new Cancion("Cancion 1", 180, "Artista 1");
        Cancion segunda = new Cancion("Cancion 2", 200, "Artista 2");
        Cancion tercera = new Cancion("Cancion 3", 240, "Artista 3");

        Playlist miLista = new Playlist();

        miLista.agregarCancion(primera);
        miLista.agregarCancion(segunda);
        miLista.agregarCancion(tercera);

        miLista.mostrarPlaylist();
    }
}

