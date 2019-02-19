package fp.daw.examen;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int repetir;
		int intentos;
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		do {
			intentos = 0;
			int n = r.nextInt(101) + 100;
			int f;
			System.out.println("Vamos a jugar a un juego");
			System.out.println("Yo voy a pensar un numero y tu vas a intentar adivinarlo");
			System.out.println("Venga di un numero entre 100 y 200: ");
			do {
				do {
					System.out.println("Numero entre 100 y 200: ");
					f = in.nextInt();
					if (n < 100 || n > 200)
						System.out.println("Porfavor, tiene que estar comprendido entre 100 y 200");
				} while (n < 100 || n > 200);
				if (f > n) {
					System.out.println("Fallaste");
					System.out.println("El numero es mas pequeño");
				} else if (f < n) {
					System.out.println("Fallaste");
					System.out.println("El numero es mas grande");
				} else {
					System.out.print("BIEN JUGADO");
				}
				intentos++;
			} while (f != n);
			if (f == n)
				System.out.println("¡GANASTE!");
			System.out.println("Tu numero de intentos ha sido de: " + intentos);
			System.out.println("¿Quieres Volver a Jugar?");
			System.out.println("Si quieres volver a jugar marca 1");
			repetir = in.nextInt();
		} while (repetir == 1);
		in.close();
	}
}
