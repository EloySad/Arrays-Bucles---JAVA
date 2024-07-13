import java.util.Scanner;

public class invertirArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el tamaño del array
        System.out.println("Ingrese el tamaño del array:");
        int size = scanner.nextInt();

        // Crear el array de números enteros
        int[] array = new int[size];

        // Solicitar al usuario que ingrese los elementos del array
        System.out.println("Ingrese los elementos del array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Mostrar el array original
        System.out.println("Array original:");
        printArray(array);

        // Invertir el array sin usar métodos predefinidos
        int[] reversedArray = reverseArray(array);

        // Mostrar el array invertido
        System.out.println("Array invertido:");
        printArray(reversedArray);
    }

    // Método para invertir un array sin usar métodos predefinidos
    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            reversedArray[j] = array[i];
        }

        return reversedArray;
    }

    // Método para imprimir un array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();  // Salto de línea al final
    }
}
