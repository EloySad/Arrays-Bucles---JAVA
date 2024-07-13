/*Un ArrayList en Java es una implementación de la interfaz List que utiliza
 un array dinámico para almacenar elementos. A diferencia de los arrays estáticos
 en Java, los ArrayLists pueden crecer dinámicamente según sea necesario.
 Esto significa que no es necesario especificar su tamaño inicial y pueden aumentar
 o disminuir de tamaño automáticamente según se añadan o eliminen elementos.

 Métodos comunes de ArrayList:
-add(E element): Añade un elemento al final del ArrayList.
-get(int index): Devuelve el elemento en la posición especificada.
-set(int index, E element): Reemplaza el elemento en la posición especificada con el elemento especificado.
-remove(int index): Elimina el elemento en la posición especificada.
-size(): Devuelve el número de elementos en el ArrayList.
-isEmpty(): Devuelve true si el ArrayList está vacío.
-contains(Object o): Devuelve true si el ArrayList contiene el elemento especificado.
-clear(): Elimina todos los elementos del ArrayList.
-addAll(Collection<? extends E> c): Añade todos los elementos de la colección especificada al final del ArrayList.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class investigacionArraylist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Pedir al usuario que ingrese los elementos del ArrayList
        System.out.println("Ingrese los elementos del ArrayList (ingrese '0' para terminar):");
        int num;
        while ((num = scanner.nextInt()) != 0) {
            arrayList.add(num);
        }

        // Mostrar los elementos del ArrayList
        System.out.println("ArrayList de enteros:");
        for (Integer number : arrayList) {
            System.out.println(number);
        }

        // Mostrar el tamaño del ArrayList
        System.out.println("Tamaño del ArrayList: " + arrayList.size());

        // Mostrar un elemento específico del ArrayList
        if (arrayList.size() > 1) {
            System.out.println("Elemento en la posición 1: " + arrayList.get(1));
        }

        // Eliminar un elemento del ArrayList
        if (!arrayList.isEmpty()) {
            arrayList.remove(0);
            System.out.println("ArrayList después de eliminar el primer elemento:");
            for (Integer number : arrayList) {
                System.out.println(number);
            }
        } else {
            System.out.println("El ArrayList está vacío después de eliminar el primer elemento.");
        }

        scanner.close();
    }
}

