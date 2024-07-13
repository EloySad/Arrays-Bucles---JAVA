import java.util.Scanner;

public class ejerciciosMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de filas y columnas de la matriz
        System.out.println("Ingrese el número de filas y columnas de la matriz (debe ser cuadrada):");
        int size = scanner.nextInt();

        // Crear la matriz
        int[][] matrix = new int[size][size];

        // Solicitar al usuario que ingrese los elementos de la matriz
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calcular la transpuesta de la matriz
        int[][] transposedMatrix = transposeMatrix(matrix, size, size);

        // Mostrar la matriz transpuesta
        System.out.println("La matriz transpuesta es:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Verificar si la matriz es simétrica
        if (isSymmetric(matrix, transposedMatrix, size)) {
            System.out.println("La matriz es simétrica.");
        } else {
            System.out.println("La matriz no es simétrica.");
        }
    }

    // Método para calcular la transpuesta de una matriz
    public static int[][] transposeMatrix(int[][] matrix, int rows, int columns) {
        int[][] transposedMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    // Método para verificar si una matriz es simétrica
    public static boolean isSymmetric(int[][] matrix, int[][] transposedMatrix, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] != transposedMatrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
