import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Dame el radio del círculo que quieres calcular: ");
        double radio = t.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo de radio " + radio + " es: " + area);
    }
}