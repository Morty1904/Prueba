import java.util.Scanner;

public class ejercicio23 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Dame un numero para darte su tabla de multiplicar: ");
        int a = t.nextInt();
        int b = 0;
        for (int i = 1; i != 11; i++) {
            b = a * i;
            System.out.println(i + "*" + a + "= " + b);
        }
    }
}