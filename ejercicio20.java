import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = t.nextInt();

        if (numero > 0 && numero % 2 == 0) {
            System.out.println("El número es positivo y par.");
        } else {
            System.out.println("El número NO es positivo y par.");
        }

        if (numero < 0 || numero % 3 == 0) {
            System.out.println("El número es negativo o divisible por 3.");
        } else {
            System.out.println("El número NO es negativo ni divisible por 3.");
        }
    }
}
