import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();
        int opcion =0;
        while (opcion != 8){
            System.out.println("bienvenido a tu conversor de monedas de confianza, ingresa un numero segun la accion que requieras:\n\n" +
                    "1.-dolar a peso mexicano\n"+
                    "2.-dolar a peso colombiano\n"+
                    "3.-dolar a dolar canadiense\n"+
                    "4.-dolar a yen japones\n"+
                    "5.-convertir otra divisa"+
                    "8.-salir");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    conversor.convertir("USD", "MXN", consulta, lectura);
                    break;
                case 2:
                    conversor.convertir( "USD","COP", consulta, lectura);
                    break;
                case 3:
                    conversor.convertir( "USD","CAD", consulta, lectura);
                    break;
                case 4:
                    conversor.convertir( "USD","JPY", consulta, lectura);
                    break;
                case 5:
                    conversor.convertirOtraMoneda(consulta,lectura);
                case 8:
                    System.out.println("gracias por usar la aplicacion, hasta la proxima.");
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;

            }
        }
    }
}
