import java.util.Random;
import java.util.Scanner;

public class ejercicio22 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner t = new Scanner(System.in);
        int a = random.nextInt(100) + 1;
        int i = 1;
        System.out.println("Dame un entero entre 1 y 100 para adivinar: ");
        int ruleta = t.nextInt();
        if (a == ruleta) {
            System.out.println("ACERTASTE!!! el numero era el " + a);
        } else {
            System.out.println("CASI!! el numero era el " + a);
            while (a != ruleta) {
                a = random.nextInt(100) + 1;
                i++;
            }
            System.out.println("Pasaron " + i + " hasta que salió tu número..");
        }
    }
}
