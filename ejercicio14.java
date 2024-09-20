import java.util.Random;

public class ejercicio14 {
    public static void main(String[] args) {
        String[] letras = {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",
                "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
                "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        };
        Random random = new Random();
        String contraseña = "";
        int coin;
        int numero;
        String letra;
        for (int i = 0; i < 8; i++) {
            coin = random.nextInt(2);
            if (coin == 0) {
                numero = random.nextInt(10);
                contraseña += numero;
            } else {
                int numero1 = random.nextInt(52);
                letra = letras[numero1];
                contraseña += letra;
            }

        }
        System.out.println(contraseña);
    }
}