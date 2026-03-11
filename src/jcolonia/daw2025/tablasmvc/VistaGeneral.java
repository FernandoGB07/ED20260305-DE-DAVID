package jcolonia.daw2025.tablasmvc;

import java.util.List;
import java.util.Scanner;

/**
 * Clase con metodos generales muy usados
 */
public class VistaGeneral {
	/**
	 * Muestra el Texto
	 */
	private String FORMATO_PRINTF_MOSTRARTEXTO;
	/**
	 * Muestra el Aviso
	 */
	private String FORMATO_PRINTF_MOSTRARAVISO;
	/**
	 * La entrada que dara el usuario a el metodo
	 */
	private static Scanner scEntrada;
	/**
	 * Pone el texto en negrita
	 */
	String ANSI_NEGRITA = "\u001B[1m";
    /**
     * Deja los futuros textos de forma normal, para evitar errores.
     */
    String ANSI_NORMAL = "\u001B[0m";
    /**
     * Pone el texto en color verde.
     */
    String ANSI_VERDE = "\u001B[32m";
	/**
	 * Muestra el texto que se quiera representar
	 * @param texto El texto deseado
	 */
	public void mostrarTexto(String texto) {
		System.out.printf(FORMATO_PRINTF_MOSTRARTEXTO,texto);
	}
	
	/**
	 * Muestra un aviso en caso de que surga algun problema o inconveniente
	 * @param texto El aviso que se quiera mostrar segun la situación
	 */
	public void mostrarAviso(String texto) {
		System.out.printf(FORMATO_PRINTF_MOSTRARTEXTO, ANSI_VERDE + texto + ANSI_NORMAL);

	}
	
	/**
	 * Muestra el título.
	 * @param texto El titulo subrayado.
	 */
	public void mostrarTítulo(String texto) {
		for(int i=0; i < texto.length();i++) {
			System.out.print("_");
		}
		System.out.println(ANSI_NEGRITA + texto + ANSI_NORMAL);
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
		System.out.println(texto);
		for(int i=0; i < texto.length();i++) {
			System.out.print("_");
		}
		System.out.println();
	}
	
	
	/**
	 * Pide un numero al usuario.
	 * @param texto El valor requerido.
	 * @return Devuelve el numero que se ha pedido.
	 */
	public static int pedirNúmero(String texto) {
		int n;
		Scanner in;
		do {
		try {
		linea=in.readline();
		n=Integer.parseInt();
		
		in = getScEntrada();
		}catch{
			
		}
		}while(true);
		System.out.printf("%s: ", texto);
		return n;
		
		
	}
	
	/**
	 * Para el proceso si se necesita.
	 * @param texto 
	 */
	public void pausa(String texto) {
		in.readline();
	}
	
	public boolean pedirConfirmación(String texto) {
		return false;
	}
	public void mostrarlista(List<String> lista) {
		
	}
	
	public static Scanner getScEntrada() {
		if (scEntrada == null) {
			scEntrada = new Scanner(System.in);
		}
		return scEntrada;
	}
}
