package jcolonia.daw2025.tablasmvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase que actua como un menú con su titulo y opciones.
 * @author <a href="mailto:fernando.garben@educa.jcyl.es">Fernando García Benito</a>
 * @version 1.01 (23/01/2026)
 */
public class VistaMenú extends VistaGeneral {
	
	/**
	 * El mensaje que se mandara cuando se solicite un numero
	 */
	private static final String INDICADOR_ENTRADA = "Introduce el numero solicitado: ";
	/**
	 * El mensaje que se lanzara cuando se introduzca un numero fuera de rango
	 */
	private static final String FORMATO_FUERA_DE_RANGO = "*** Por favor, ¡escriba un numero entre %d y %d!%n";
	/**
	 * Solicita al usuario una de las opciones.
	 */
	private static Scanner scIn;
	
	
    /**
     * El titulo que se pondra en el Menú
     */
    private String título;
    /**
     * Las posibles opciones que saldran en el Menú
     */
    private List<String> opciones;

    /**
     * Contructor principal de la clase VistaMenú, Genera el Menú
     * con el titulo y las opciones.
     * @param título El titulo del programa
     * @param opciones Las distintas opciones que se mostraran en el Menú.
     */
    public VistaMenú(String título, List<String> opciones) {
        this.título = título;
        this.opciones = new ArrayList<String>(opciones);

    }

    

    /**
     * Imprime las distintas opciones del menú
     */
    public void mostrarOpciones() {
		int contador;
		
		contador = 1;
		for (int i=0; i< opciones.size(); i++) {
			System.out.printf("   %d) %s%n", contador, opciones.get(i));
			contador ++;
		}
		System.out.println("   0) Salir");
    }
       
    

    /**
     * Lanza un texto personalizado que indica que se ponga
     * un numero para elegir opción que se requiera. 
	 * @return número de opción elegido
     */
    public int pedirOpción() {
		int opciónElegida = 0;
		int mín, máx;
		String línea;
		boolean salir; 
		
		mín = 0;
		máx = opciones.size();
		
		salir= false;
		
		do {
			try {
				System.out.print(INDICADOR_ENTRADA);
				 línea= scIn.nextLine();
				 opciónElegida = Integer.parseInt(línea);
				if(opciónElegida<mín||opciónElegida>máx) {
					System.out.printf(FORMATO_FUERA_DE_RANGO, mín, máx);
					// throw new NumberFormatException("Valor fuera de Rango");
				}else {
					salir = true;
				}
			} catch (NumberFormatException e) {
				System.out.printf(FORMATO_FUERA_DE_RANGO, mín, máx);
			}
		}while(!salir);	
		return opciónElegida;
	}
}