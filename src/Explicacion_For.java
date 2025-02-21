import java.util.Scanner;

/**
 * Bucle for
 * Sintaxis:
 *      for(inicializacion; condicion; incremento/decremento){
 *              bloque de instrucciones
 *      }
 */

public class Explicacion_For {
    public static void main(String[] args) {
        //mostrar por pantalla 10 veces "ECO"
        for (int i = 1; i <= 10; i++) {     //variable locañm (solo funciona dentro del bloque
            System.out.println("ECO " +i);
        }
        //ERROR -> System.out.println("Se ha ejecutado ECO " +i+ "veces");

        //BUCLE for** decremento
        // muestra los años entre 2025 y 2020 de forma decreciente
        for (int i = 2025; i >= 2020; i--) {
            System.out.println("Año " +i);
        }

        //solicita 10 notas y muetra la media
        Scanner sc = new Scanner(System.in);
        double nota=0;
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Nota " +i);
//            nota += sc.nextDouble();
//        }
//        System.out.println("La media de las 10 notas es " +(nota/10));

        //Solicitamos al usuario cuantas notas va a introducir, lo leemos en una variable que formará parte de la instruccion for
        System.out.println("Indique el número de alumnos: ");
        byte alumnos=sc.nextByte();
        for (int i = 1; i <= alumnos; i++) {
            System.out.println("Nota del Alumno " + i);
            nota+=sc.nextDouble();
        }
        System.out.println("La media de las notas es " +(nota/alumnos));
    }
}