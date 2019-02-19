package fp.daw.examen;

public class Ejercicio4 {

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

	public static void main(String[] args) {

		int[] vector = { 3, 3, 3, 6, 8, 3, 4, 5, 5, 2, 1, 1, 2, 9, 8 };
		int[] vector2 = { 1, 1, 2, 3 };
		int[] vector3 = { 3, 2, 6, 6, 3, 3 };

		numsecuencias(vector);
		numsecuencias(vector2);
		numsecuencias(vector3);

	}

}
