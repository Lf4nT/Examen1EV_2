package fp.daw.examen;

public class Ejercicio4 {

	/*
	 * 2 puntos
	 * 
	 * Define, después de este comentario, un método llamado 'numSecuencias' que
	 * reciba en un parámetro formal un vector de números enteros y retorne el
	 * número de secuencias de números repetidos. Ejemplo, si el contenido del
	 * vector es:
	 * 
	 * [9,2,2,3,2,5,7,7,7,4] * * * * *
	 * 
	 * el método retornará el valor 2 ya que contiene las dos secuencias de
	 * números repetidos que se han señalado con los asteriscos.
	 * 
	 */

	public static void numsecuencias(int[] nums) {
		int Repeticion = 0;
		boolean SeRepite = false;
		for (int i = 0; i < nums.length - 1; i++) {
			if (SeRepite) {
				if (nums[i] != nums[i + 1])
					SeRepite = false;
			} else if (nums[i] == nums[i + 1]) {
				SeRepite = true;
				Repeticion++;
			}
		}
		System.out.println("numero de repeticiones en vector: " + Repeticion);
	}

	/*
	 * 1 punto
	 * 
	 * Escribe en el método main las sentencias necesarias para crear un vector de
	 * números enteros de un tamaño aleatorio entre 10 y 100 y llenarlo con
	 * números enteros aleatorios comprendidos entre -100 y 100. A continuación se
	 * mostrará su contendio por pantalla invocando al método 'mostrarVector'
	 * definido en el ejercicio 1 y el número de secuencias de números repetidos
	 * que contiene invocando al método 'numSecuencias'.
	 * 
	 */

	public static void main(String[] args) {

		int[] vector = { 3, 3, 3, 6, 8, 3, 4, 5, 5, 2, 1, 1, 2, 9, 8 };
		int[] vector2 = { 1, 1, 2, 3 };
		int[] vector3 = { 3, 2, 6, 6, 3, 3 };

		numsecuencias(vector);
		numsecuencias(vector2);
		numsecuencias(vector3);

	}

}
