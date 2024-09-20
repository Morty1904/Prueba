import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Se va a hacer (x+y)*z, dame el valor de x: ");
        float a = t.nextFloat();
        System.out.print("Dame y: ");
        float b = t.nextFloat();
        System.out.print("Dame z: ");
        float c = t.nextFloat();
        float sol = (a + b) * c;
        System.out.println(a + "+" + b + "*" + c + "=" + sol);
    }

}