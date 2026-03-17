package jcolonia.daw2025.tablasmvc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

	/**
	 * La tabla de multiplicar del programa.
	 */
	public class TablaMultiplicar {
		private int numero;
		private List<String> listaTextos;
	
		/**
		 * El constructor para la Tabla de Multiplicar
		 * @param numero El numero del cual se hara la tabla de multiplicar.
		 */
		public TablaMultiplicar(int numero) {
			this.numero= numero;
			this.listaTextos = new ArrayList<>();
		}
		/**
		 * 
		 */
		public void generarTabla() {
			listaTextos.clear();
	        for (int i = 0; i <= 10; i++) {
	            listaTextos.add(numero + " x " + i + " = " + (numero * i));
	        }
			
		}
		/**
	     * Devuelve la lista de strings para que se guarde en el archivo.
		 * @return La Lista con los textos
	     */
		public List<String> toListaExportación () {
			return new ArrayList<>(listaTextos);			
		}
		
		/**
	     * Devuelve la lista de Strings para que se muestre en consola.
		 * @return Devuelve la lista de Strings
	     */
		public List<String> toListaPantalla () {
			return listaTextos;
			
		}
		/**
	     * Enseña la tabla del numero indicado.
		 * @return La tabla del numero indicado
	     */
		public String toString() {
			return "Tabla del " + numero;
		}
	}


