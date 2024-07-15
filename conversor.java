import java.util.Scanner;

public class conversor {

    public static void convertir (String monedaBase, String monedaAConvertir, ConsultarMoneda consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaAConvertir);
        System.out.println("ingrese la cantidad de" + monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.tasaDeCambio();
        System.out.println(cantidad + monedaBase + cantidadConvertida + monedas.tasaDeCambio());
        }
        public static void convertirOtraMoneda(ConsultarMoneda consulta, Scanner lectura) {
            System.out.println("ingrese el codigo de la moneda que quiere conocer (3 letras)");
            String monedaBase = lectura.nextLine().toUpperCase();
            System.out.println("ingrese la moneda objetivo: ");
            String monedaObjetivo = lectura.nextLine().toUpperCase();
            convertir(monedaBase,monedaObjetivo, consulta,lectura);
    }
}
