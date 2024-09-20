import java.util.Random;

public class ejercicio14 {
    public static void main(String[] args) {
        Random random = new Random();
        String contraseña = "";
        for (int i = 0; i < 8; i++) {
            int numero = random.nextInt(10);
            contraseña += numero;
        }
        System.out.println(contraseña);
    }
}