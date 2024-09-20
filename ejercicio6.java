import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Dame 2 números enteros (pulsa enter para confirmar cada uno): ");
        float a = t.nextFloat();
        float b = t.nextFloat();
        float suma = a + b;
        System.out.println("La suma de estos es =" + suma);
    }
}
