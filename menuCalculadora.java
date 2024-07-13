import java.util.Scanner;

public class menuCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");

            int option = scanner.nextInt();

            if (option == 5) {
                exit = true;
                System.out.println("Hasta una nueva operacion");
                continue;
            }

            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            switch (option) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Error: División por cero");
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }

        scanner.close();
    }
}

