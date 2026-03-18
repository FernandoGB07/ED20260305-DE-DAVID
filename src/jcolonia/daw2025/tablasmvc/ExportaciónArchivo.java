package jcolonia.daw2025.tablasmvc;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Se encarga de exprotar la tabla de multiplicar a un .txt
 * 
 * @author <a href="mailto:fernando.garben@educa.jcyl.es">Fernando García Benito</a>
 * @version 1.01 (18/03/2026)
 */
public class ExportaciónArchivo {
	/**
     * Guarda la lista de textos en un archivo con el nombre facilitado.
     * @param nombreArchivo El nombre del destino.
     * @param datos La lista de líneas a escribir.
     * @throws ExcepcionesES Si ocurre un error de escritura (archivo no encontrado, etc.)
     */
    public static void guardar(String nombreArchivo, List<String> datos) throws ExcepcionesES {
        try (PrintWriter salida = new PrintWriter(nombreArchivo)) {
            for (String linea : datos) {
                salida.println(linea);
            }
        } catch (FileNotFoundException e) {
            throw new ExcepcionesES("Error al crear el archivo: " + e.getMessage());
        }
    }
}