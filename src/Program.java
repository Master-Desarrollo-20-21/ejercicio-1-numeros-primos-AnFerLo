
public class Program {
	public static boolean esPrimo(int numero) {
		assert numero > 1;
		for (int x = 2; x < numero; x++) {
			if (numero % x == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int suma = 0;
		for (int x = 2; x < 51; x++) {
			if (esPrimo(x)) {
				suma += x;
			}
		}
		System.out.println("Suma de los primos entre 1 y 50 = " + suma);
		int cx = 0, j = 2;
		suma = 0;
		while (cx < 50) {
			if (esPrimo(j)) {
				cx++;
				suma += j;
			}
			j++;
		}
		System.out.println("Suma de los primeros 50 primos = " + suma);
	}

}
