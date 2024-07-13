import java.util.Scanner;

public class calculadoraPromedioFaltante {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingreso de la cantidad total de calificaciones
        System.out.print("¿Cuántas calificaciones tiene el curso en total? ");
        int totalCalificaciones = sc.nextInt();

        // Ingreso de la cantidad de calificaciones ya obtenidas
        System.out.print("¿Cuántas calificaciones ya has obtenido? ");
        int calificacionesObtenidas = sc.nextInt();

        // Validación de las cantidades ingresadas
        while (calificacionesObtenidas > totalCalificaciones) {
            System.out.println("Error: la cantidad de calificaciones ya obtenidas no puede ser mayor a la cantidad total de calificaciones. Inténtalo de nuevo.");
            calificacionesObtenidas = sc.nextInt();
        }

        // Ingreso de las calificaciones obtenidas
        int[] calificaciones = new int[totalCalificaciones];
        for (int i = 0; i < calificacionesObtenidas; i++) {
            System.out.print("Ingresa la calificación " + (i + 1) + ": ");
            calificaciones[i] = sc.nextInt();

            // Validación de la calificación
            while (calificaciones[i] < 0 || calificaciones[i] > 100) {
                System.out.println("Error: la calificación debe estar entre 0 y 100. Inténtalo de nuevo.");
                calificaciones[i] = sc.nextInt();
            }
        }

        // Cálculo del promedio actual
        double promedioActual = 0;
        for (int i = 0; i < calificacionesObtenidas; i++) {
            promedioActual += calificaciones[i];
        }
        promedioActual /= calificacionesObtenidas;

        // Cálculo de la cantidad de notas faltantes
        int notasFaltantes = totalCalificaciones - calificacionesObtenidas;

        // Cálculo de la calificación mínima necesaria en las notas faltantes
        double calificacionMinimaRestante = (76 - (promedioActual * calificacionesObtenidas)) / notasFaltantes;

        // Mostrar el resultado
        System.out.println("Para aprobar el curso, necesitas sacar un promedio de " + calificacionMinimaRestante + " en las " + notasFaltantes + " notas faltantes.");

        // Cálculo de la nota mínima para cada calificación restante
        double[] notasIndividualesNecesarias = calcularNotasIndividualesNecesarias(promedioActual, calificacionesObtenidas, totalCalificaciones, 76);

        // Mostrar las notas individuales necesarias
        System.out.println("Notas individuales necesarias para cada calificación restante:");
        for (int i = 0; i < notasIndividualesNecesarias.length; i++) {
            System.out.println("Nota " + (calificacionesObtenidas + i + 1) + ": " + notasIndividualesNecesarias[i]);
        }
    }

    // Método para calcular las notas individuales necesarias para alcanzar el promedio deseado
    public static double[] calcularNotasIndividualesNecesarias(double promedioActual, int calificacionesObtenidas, int totalCalificaciones, double promedioDeseado) {
        int notasFaltantes = totalCalificaciones - calificacionesObtenidas;
        double[] notasNecesarias = new double[notasFaltantes];
        double sumaCalificacionesNecesarias = promedioDeseado * totalCalificaciones - promedioActual * calificacionesObtenidas;

        for (int i = 0; i < notasFaltantes; i++) {
            notasNecesarias[i] = sumaCalificacionesNecesarias / notasFaltantes;
        }

        return notasNecesarias;
    }
}
