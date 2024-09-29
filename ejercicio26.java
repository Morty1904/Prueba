public class MultiplicacionMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas de la primera matriz: ");
        int filas1 = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la primera matriz (y filas de la segunda): ");
        int columnas1 = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la segunda matriz: ");
        int columnas2 = scanner.nextInt();

        int[][] matriz1 = new int[filas1][columnas1];
        int[][] matriz2 = new int[columnas1][columnas2];
        int[][] resultado = new int[filas1][columnas2];

        System.out.println("Ingrese los elementos de la primera matriz:");
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ingrese los elementos de la segunda matriz:");
        for (int i = 0; i < columnas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                matriz2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                for (int k = 0; k < columnas1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        System.out.println("Resultado de la multiplicación de matrices:");
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}