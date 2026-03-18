package jcolonia.daw2025.tablasmvc;

/**
 * Excepciones personalizadas para el Programa.
 * @author <a href="mailto:fernando.garben@educa.jcyl.es">Fernando García Benito</a>
 * @version 1.01 (18/03/2026)
 */
public class ExcepcionesES extends Exception{


	/**
	 * El constructor para las excepciones personalizadas
	 * @param mensaje El mensaje donde dira el error que se cometio.
	 */
	
	public ExcepcionesES(String mensaje) {
		super(mensaje);
	}
}