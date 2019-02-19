package fp.daw.examen;

public class Ejercicio3 {

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

	public static void main(String[] args) {
		char[][] c = stringToArray2D("Hola Buenas");
		Ejercicio1.mostrarVector(c[0]);
		System.out.println();
		Ejercicio1.mostrarVector(c[1]);
	}

}