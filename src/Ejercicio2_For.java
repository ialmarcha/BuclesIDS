import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Implementar una aplicación que solicite al usuario un número comprendido entre el 1 y el 10, si se equivoca,, debes solicitarlo nuevamente (do-while)
 * Luego de leer correctamente ese número, mostrar por pantalla, la tabla de multiplicar de dicho número (for)
 *  1. Declarar Scanner
 *  2. Declara - inicializa el número
 *  3. se crea el búcle Do (solicitar y leer el número)-While(muentras que esté comprendido en: (n<1 || n>10))
 *  4. Bucle For del 1-10 (dentro se muestra el valor de i)
 */
public class Ejercicio2_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =0;

        do{
            System.out.println("Ingrese un número comprendido entre 1 y 10: ");
            n=sc.nextInt();
        }while(n<1 || n>10);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i+"*"+n+"="+(i*n));
        }


    sc.close();
    }

}
