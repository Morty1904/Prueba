import java.util.Scanner;

public class ejercicio16 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int año = t.nextInt();

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println(año + " es bisiesto.");
        } else {
            System.out.println(año + " no es bisiesto.");
        }
    }
}