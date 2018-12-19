package fp.daw.examen;

public class Ejercicio3 {

	/*
	 * 2 puntos
	 * 
	 * Define, después de este comentario, un método llamado 'stringToArray2D' que
	 * reciba como parámetro una cadena de caracteres y retorne un array de
	 * caracteres de dos dimensiones que tendrá exactamente dos filas y el contenido
	 * siguiente en cada una de ellas:
	 * 
	 * * Primera fila: caracteres de la cadena que ocupan posiciones pares (0, 2, 4,
	 * ...). * Segunda fila: caracteres de la cadena que ocupan posiciones impares
	 * (1, 3, 5, ...).
	 * 
	 * El número de columnas en cada fila no excederá del estrictamente necesario
	 * para almacenar los caracteres que se indican en cada caso.
	 * 
	 */

	public static char[][] stringToArray2D(String str) {
		char[][] c = new char[2][];
		int l = str.length() / 2;
		c[0] = new char[l + str.length() % 2];
		c[1] = new char[l];
		for (int i = 0; i < str.length(); i++)
			if (i % 2 == 0)
				c[0][i / 2] = str.charAt(i);
			else
				c[1][i / 2] = str.charAt(i);
		return c;
	}

	/*
	 * 1 punto
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba el
	 * método 'stringToArray2D' mostrando por pantalla el resultado de su ejecución.
	 * Se mostrará en cada fila del array en una línea de la pantalla utilizando
	 * para ello el método definido en el ejercicio 1.
	 * 
	 */

	public static void main(String[] args) {
		char[][] c = stringToArray2D("VIVA xX-SpinBotMaster69-Xx");
		Ejercicio1.mostrarVector(c[0]);
		System.out.println();
		Ejercicio1.mostrarVector(c[1]);
	}

}