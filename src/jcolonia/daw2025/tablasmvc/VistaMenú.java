package jcolonia.daw2025.tablasmvc;

import java.util.List;

public class VistaMenú extends VistaGeneral {
    private String titulo;
    private List<String> opciones;

    public VistaMenú(String título, List<String> opciones) {
        this.titulo = título;
        this.opciones = opciones;
    }

    public void mostrArtítulo() {
        super.mostrarTítulo(titulo);
    }

    public void mostrarOpciones() {
        if (opciones != null) {
            for (String linea : opciones) {
                System.out.println(linea);
            }
        }
    }

    public int pedirOpción() {
        mostrArtítulo();
        mostrarOpciones();
        return VistaGeneral.pedirNúmero("Seleccione una opcion");
    }

    @Override
    public void mostrarTexto(String texto) {
        super.mostrarTexto(texto);
    }
}