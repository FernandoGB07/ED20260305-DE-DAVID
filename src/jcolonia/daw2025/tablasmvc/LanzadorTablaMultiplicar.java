package jcolonia.daw2025.tablasmvc;
/**
* Lanzador de aplicación de consola de texto con menús. Aplicación
* de texto usando tablas de multiplicar infantiles clásicas.
* @author <a href="mailto:fernando.garben@educa.jcyl.es">Fernando García Benito</a>
* @version 1.01 (17/03/2026)
*/
public class LanzadorTablaMultiplicar {
	/**
	* Inicia el menú principal del programa.
	* @param argumentos opciones de ejecución -no se usan-
	*/
	public static void main (String[] argumentos){
		ControlTablaMultiplicar programa;
		
		programa = new ControlTablaMultiplicar();
		
		programa.buclePrincipal();
	}
}