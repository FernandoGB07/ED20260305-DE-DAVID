package jcolonia.daw2025.tablasmvc;

import java.util.List;
import java.util.Scanner;

public class VistaGeneral {
	String FORMATO_PRINTF_MOSTRARTEXTO;
	String FORMATO_PRINTF_MOSTRARAVISO;

	/**
	 * Muestra el texto que se quiera representar
	 * @param texto El texto deseado
	 */
	public void mostrarTexto(String texto) {
		
	}
	
	/**
	 * Muestra un aviso en caso de que surga algun problema o inconveniente
	 * @param texto El aviso que se quiera mostrar segun la situación
	 */
	public void mostrarAviso(String texto) {
		
	}
	
	/**
	 * Muestra el título.
	 * @param texto El titulo subrayado.
	 */
	public void mostrarTítulo(String texto) {
		System.out.println(texto);
		for(int i=0; i < texto.length();i++) {
			System.out.print("_");
		}
		System.out.println();
	}
	
	/**
	 * Muestra un leve subtitulo.
	 * @param texto EL subtitulo que se quiera mostrar.
	 */
	public void mostrarTítulo2(String texto) {
		
	}
	
	/**
	 * Pide un numero al usuario.
	 * @param texto El valor requerido.
	 * @return Devuelve el numero que se ha pedido.
	 */
	public static int pedirNúmero(String texto) {
		int n;
		Scanner in;
		
		in = getScEntrada();
		
		System.out.printf("%s: ", texto);
		
		
	}
	
	public void pausa(String texto) {
		
	}
	
	public boolean pedirConfirmación(String texto) {
		return false;
	}
	public mostrarlista(List<String> lista) {
		
	}
	
	public static Scanner getScEntrada() {
		if (scEntrada == null) {
			scEntrada = new Scanner(System.in);
		}
		return scEntrada;
	}
}
