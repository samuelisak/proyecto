package calculadora;

           import java.util.Scanner;
   public class Main {
        public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);

                    System.out.println("Ingrese el precio del producto: $");
                  double precioBase    = scanner.nextDouble();
                   System.out.println("Ingrese el porcentaje de impuesto del producto(%): ");
                   double porcentajeIVA = scanner.nextDouble();

                   double montoIVA          = precioBase * (porcentajeIVA / 100);
                   double precioConImpuesto = precioBase + montoIVA;

                   if (precioConImpuesto <= 100.00) {

                           System.out.println("\nEl precio con impuesto es: $"
                                           + String.format("%.2f", precioConImpuesto));
                         System.out.println("");
                           System.out.println("PRECIO MENOR A $100:");
                           System.out.println("Debes pagar solo: $"
                                           + String.format("%.2f", precioConImpuesto));
                       } else {

                           System.out.println("\nEl precio con impuesto es: $"
                                           + String.format("%.2f", precioConImpuesto));
                           System.out.println("");
                           System.out.println("PRECIO MAYOR A $100:");

                           System.out.println("Ingrese el porcentaje de descuento (%): ");
                           double porcentajeDescuento = scanner.nextDouble();


                           double precioFinal = calcularPrecioFinal(
                                           precioBase,
                                           porcentajeIVA,
                                           porcentajeDescuento
                                   );

                           System.out.println("");
                           System.out.println("DEBES PAGAR AHORA:");
                           System.out.println("Precio final: $"
                                           + String.format("%.2f", precioFinal));
                       }

                   scanner.close();
               }

               public static double calcularPrecioFinal(double precioBase,
                                                double porcentajeIVA,
                                                double porcentajeDescuento)
       {
                  double montoIVA = precioBase * (porcentajeIVA / 100);
                  double precioConImpuesto = precioBase + montoIVA;
                   if (precioConImpuesto <= 100.00)
                       {
                           return precioConImpuesto;
                       } else
                   {
                           double montoDescuento = precioConImpuesto * (porcentajeDescuento / 100);
                           return precioConImpuesto - montoDescuento;
                       }
             }
}
