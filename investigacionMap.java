/*Un Map en Java es una interfaz que representa una colección de
pares clave-valor, donde cada clave es única y no puede haber claves duplicadas.
Algunos tipos comunes de implementaciones de Map en Java son HashMap, TreeMap,
LinkedHashMap, entre otros. Aquí te proporcionaré ejemplos básicos utilizando HashMap,
que es una implementación de Map que no garantiza el orden de los elementos.

Métodos comunes de Map (implementados por HashMap):
-put(K key, V value): Añade un par clave-valor al mapa.
-get(Object key): Devuelve el valor asociado con la clave especificada.
-containsKey(Object key): Devuelve true si el mapa contiene una clave específica.
-containsValue(Object value): Devuelve true si el mapa contiene un valor específico.
-remove(Object key): Elimina el par clave-valor asociado con la clave especificada.
-size(): Devuelve el número de pares clave-valor en el mapa.
-isEmpty(): Devuelve true si el mapa no contiene ningún par clave-valor.
-keySet(): Devuelve un conjunto de todas las claves en el mapa.
-values(): Devuelve una colección de todos los valores en el mapa.
-entrySet(): Devuelve un conjunto de pares clave-valor en el mapa.
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class investigacionMap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> hashMap = new HashMap<>();

        // Pedir al usuario que ingrese los elementos del HashMap
        System.out.println("Ingrese los elementos del HashMap (ingrese '0' para terminar):");
        int key;
        String value;
        while (true) {
            System.out.print("Clave (entero): ");
            key = scanner.nextInt();
            if (key == 0) break;
            System.out.print("Valor (cadena): ");
            value = scanner.next();
            hashMap.put(key, value);
        }

        // Mostrar los elementos del HashMap
        System.out.println("\nHashMap de enteros a cadenas:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        // Mostrar el tamaño del HashMap
        System.out.println("\nTamaño del HashMap: " + hashMap.size());

        // Verificar si contiene una clave específica
        System.out.print("Ingrese una clave para verificar si está presente: ");
        key = scanner.nextInt();
        if (hashMap.containsKey(key)) {
            System.out.println("El HashMap contiene la clave " + key);
        } else {
            System.out.println("El HashMap no contiene la clave " + key);
        }

        // Verificar si contiene un valor específico
        System.out.print("Ingrese un valor para verificar si está presente: ");
        value = scanner.next();
        if (hashMap.containsValue(value)) {
            System.out.println("El HashMap contiene el valor \"" + value + "\"");
        } else {
            System.out.println("El HashMap no contiene el valor \"" + value + "\"");
        }

        // Eliminar un elemento del HashMap
        System.out.print("Ingrese la clave del elemento a eliminar: ");
        key = scanner.nextInt();
        if (hashMap.containsKey(key)) {
            hashMap.remove(key);
            System.out.println("Elemento eliminado del HashMap.");
        } else {
            System.out.println("No se encontró ninguna clave correspondiente en el HashMap.");
        }

        // Mostrar el HashMap actualizado
        System.out.println("\nHashMap después de eliminar:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        scanner.close();
    }
}

