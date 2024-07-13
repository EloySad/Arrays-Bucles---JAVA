import java.util.Scanner;

public class busquedaCoincidencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un array de marcas de autos
        String[] carBrands = {"Toyota", "Honda", "Ford", "Chevrolet", "BMW", "Renault", "Mazda"};

        // Solicitar al usuario que ingrese una marca de auto
        System.out.println("Ingrese una marca de auto para buscar:");
        String brandToSearch = scanner.nextLine();

        // Buscar la marca en el array
        int position = searchBrandInArray(carBrands, brandToSearch);

        // Mostrar el resultado
        if (position == -1) {
            System.out.println("La marca \"" + brandToSearch + "\" no se encontró en el array.");
        } else {
            System.out.println("La marca \"" + brandToSearch + "\" se encontró en la posición: " + position);
        }
    }

    // Método para buscar una marca en el array de marcas de autos
    public static int searchBrandInArray(String[] array, String brand) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(brand)) {
                return i;
            }
        }
        return -1; // Retorna -1 si no se encuentra la marca
    }
}
