import java.util.Scanner;

/*
 * Solicita al usuario un número y dibuja un triángulo con base=num y altura=n
 * Ejemplo num=4
 *      *
 *     * *
 *    * * *
 *   * * * *
 *
 */
public class Triángulo {
    public static void main(String[] args) {
        System.out.println("Indique la base y altura del triángulo");
        int num=new Scanner(System.in).nextInt();

        for (int fila=1;fila<=num;fila++) { //fila
            //tenemos que tener en cuenta los espacios necesarios
            for (int espacio=0;espacio<=num-fila;espacio++) {
                System.out.print(" ");
            }
            for (int signo=1;signo<=fila;signo++) {
                System.out.print("🔴");
            }
            System.out.println();   //salto de línea
        }








    }
}
