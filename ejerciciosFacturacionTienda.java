import java.util.Scanner;

public class ejerciciosFacturacionTienda {
    public static void main (String[] args){
        String[] productos = {"Camisa", "Pantalón", "Zapatos"};
        double[] precios = {2.00, 3.50, 4.50};

        Scanner sc = new Scanner(System.in);

        int [] cantidad = new int[productos.length];

        for (int i = 0; i < productos.length; i++) {
            System.out.print("Ingrese la cantidad de " + productos[i] + " que desea comprar: ");
            cantidad[i] = sc.nextInt();
        }

        double montoCompra = 0.0;
        for (int i = 0; i < productos.length; i++) {
            montoCompra += precios[i] * cantidad[i];
        }

        double descuento = 0;
        if (montoCompra >= 1000) {
            descuento = montoCompra * 0.25;
        } else if (montoCompra >= 500) {
            descuento = montoCompra * 0.2;
        } else if (montoCompra >= 300) {
            descuento = montoCompra * 0.15;
        } else if (montoCompra >= 200) {
            descuento = montoCompra * 0.1;
        }

        // Cálculo del monto final a pagar
        double montoFinal = montoCompra - descuento;

        // Mostrar el resultado
        System.out.println("Subtotal: $" + montoCompra);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + montoFinal);
    }
}


