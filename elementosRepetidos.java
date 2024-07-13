import java.util.*;

public class elementosRepetidos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el tamaño del array
        System.out.println("Ingrese el tamaño del array:");
        int size = scanner.nextInt();

        // Crear el array de tipo Object para almacenar números y letras
        Object[] array = new Object[size];

        // Solicitar al usuario que ingrese los elementos del array
        System.out.println("Ingrese los elementos del array (números o letras):");
        for (int i = 0; i < size; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            if (scanner.hasNextInt()) {
                array[i] = scanner.nextInt();
            } else {
                array[i] = scanner.next();  // Si no es un entero, se asume que es una cadena (letra)
            }
        }

        // Calcular la frecuencia de los elementos
        Map<Object, Integer> frequencyMap = calculateFrequency(array);

        // Ordenar los elementos por frecuencia
        List<Map.Entry<Object, Integer>> sortedList = sortByFrequency(frequencyMap);

        // Mostrar el resultado
        System.out.println("Elementos ordenados por frecuencia:");
        for (Map.Entry<Object, Integer> entry : sortedList) {
            System.out.println("Elemento: " + entry.getKey() + " - Frecuencia: " + entry.getValue());
        }
    }

    // Método para calcular la frecuencia de los elementos
    public static Map<Object, Integer> calculateFrequency(Object[] array) {
        Map<Object, Integer> frequencyMap = new HashMap<>();

        for (Object element : array) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        return frequencyMap;
    }

    // Método para ordenar los elementos por frecuencia
    public static List<Map.Entry<Object, Integer>> sortByFrequency(Map<Object, Integer> frequencyMap) {
        List<Map.Entry<Object, Integer>> list = new ArrayList<>(frequencyMap.entrySet());

        list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        return list;
    }
}
