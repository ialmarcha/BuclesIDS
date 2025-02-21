import java.util.Scanner;
/*
Solicita un número al usuario y muestra por pantalla desde el 1 hasta el número ingresado.
Requisito-- el número es un entero positivo
    1. Declaración del Scanner
    2. Solicitar y leer el número
    3. Crear el bucle for con el número indicado en la condición
    4. Dentro del bucle for, ir mostrando el valor de i
 */
public class Ejercicio1_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero positivo: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.println(i);

        }
        sc.close();
    }
}
