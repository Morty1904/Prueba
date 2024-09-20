import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int numero = 1;
        int suma = 0;

        while (numero != 0) {
            System.out.println("Dame un número para añadir a la suma(0 para salir): ");
            numero = t.nextInt();
            suma += numero;
        }

        System.out.println(suma);
    }
}
