import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Ingresa un número entre 1 y 7: ");
        int numero = t.nextInt();
        String dia;
        switch (numero) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miércoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Número inválido.";
        }
        System.out.println("El día es: " + dia);
    }
}
