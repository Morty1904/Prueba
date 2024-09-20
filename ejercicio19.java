import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Dime tu edad: ");
        int a = t.nextInt();
        if (a < 18) {
            System.out.println("Yes menor no puedes votar (verificación denegada)");
        } else {
            System.out.println("Mayor de edad.. Verificación confirmada");
        }
    }
}
