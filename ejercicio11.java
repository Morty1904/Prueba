import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dame un número para calcular su cuadrado: ");
        double numero = scanner.nextDouble();
        double cuadrado = Math.pow(numero, 2);
        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);

        System.out.print("Dame un número positivo para calcular su raíz cuadrada: ");
        double numeroRaiz = scanner.nextDouble();
        if (numeroRaiz < 0) {
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
        } else {
            double raizCuadrada = Math.sqrt(numeroRaiz);
            System.out.println("La raíz cuadrada de " + numeroRaiz + " es: " + raizCuadrada);
        }

        System.out.print("Ingrese un número para calcular su valor absoluto: ");
        double numeroAbs = scanner.nextDouble();
        double valorAbsoluto = Math.abs(numeroAbs);
        System.out.println("El valor absoluto de " + numeroAbs + " es: " + valorAbsoluto);

        scanner.close();
    }
}
