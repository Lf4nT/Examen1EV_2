package fp.daw.examen;

public class Ejercicio1 {

	public static void mostrarVector(int[] vector) {

		System.out.print("[");
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]);
			if (i != vector.length - 1)
				System.out.print(", ");
		}
		System.out.print("]");
	}

	public static void mostrarVector(char[] vector) {

		System.out.print("[");
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]);
			if (i != vector.length - 1)
				System.out.print(", ");
		}
		System.out.print("]");
	}

	public static void main(String[] args) {
		int[] x = { 42, 36, 54, 87 };
		mostrarVector(x);
	}
}