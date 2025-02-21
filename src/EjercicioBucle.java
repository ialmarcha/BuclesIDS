import java.util.Scanner;

/**
 * Solicita al usuario su nombre, y repetidamente, pregúntale cuánto dinero tiene. En momento que teclee -1, el programa saldrá y le mostrará por pantalla el total que ha indicado
 * Pistas: usa un do-while
 */
public class EjercicioBucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        double dinero=0;
        double contador=0;

        do {
            System.out.println("Ingrese el dinero, para salir ingresa -1: ");
            dinero = sc.nextDouble();
            if (dinero!=-1) {
                contador+=dinero;
            }
        }while (dinero != -1);
        System.out.println("Tienes " + contador+ " € de dinero");



















    }
}
