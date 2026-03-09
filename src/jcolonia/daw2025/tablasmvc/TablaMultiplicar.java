package jcolonia.daw2025.tablasmvc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

	/**
	 * Tabla de multiplicar, hecha con el 7 de ejemplo.
	 */
	public class TablaMultiplicar {
		
		public static void main(String[]args) {
			File refArchivo = new File("TablaMultiplicar.txt");
			
			
			try (PrintWriter out = new PrintWriter(refArchivo)) {
				for(int i = 0; i <=10; i++ ) {
				out.printf("%d x 7 = %d%n", i, (i*7));
			}
			} catch (FileNotFoundException e) {
				System.err.printf("Ruta no encontrada: %s",
				e.getLocalizedMessage());
				}

		}
	}


