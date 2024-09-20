import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        double radio = t.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
    }
}