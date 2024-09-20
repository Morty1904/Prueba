import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.print("Ingresa un número entero: ");
		int a = t.nextInt();

		System.out.print("Ingresa un número decimal: ");
		float b = t.nextFloat();

		t.nextLine();

		System.out.print("Ingresa una cadena de texto: ");
		String pepe = t.nextLine();
		System.out.printf("Texto: %s, Número entero: %d, Número decimal: %.2f%n", pepe, a, b);
	}
}