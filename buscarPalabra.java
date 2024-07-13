import java.util.ArrayList;
import java.util.Scanner;

public class buscarPalabra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un texto
        System.out.println("Ingrese un texto:");
        String text = scanner.nextLine();

        // Solicitar al usuario que ingrese la palabra a buscar
        System.out.println("Ingrese la palabra a buscar:");
        String word = scanner.nextLine();

        // Convertir el texto y la palabra a minúsculas para ignorar mayúsculas/minúsculas
        String textLower = text.toLowerCase();
        String wordLower = word.toLowerCase();

        // Buscar la palabra en el texto
        ArrayList<Integer> positions = searchWordInText(textLower, wordLower);

        // Mostrar el resultado
        if (positions.isEmpty()) {
            System.out.println("La palabra \"" + word + "\" no se encontró en el texto.");
        } else {
            System.out.println("La palabra \"" + word + "\" se encontró en las posiciones:");
            for (int position : positions) {
                System.out.println("Desde la posición " + position + " hasta la posición " + (position + word.length() - 1));
            }
        }
    }

    // Método para buscar una palabra en un texto y devolver las posiciones donde se encuentra
    public static ArrayList<Integer> searchWordInText(String text, String word) {
        ArrayList<Integer> positions = new ArrayList<>();
        int index = text.indexOf(word);

        while (index >= 0) {
            positions.add(index);
            index = text.indexOf(word, index + 1);
        }

        return positions;
    }
}