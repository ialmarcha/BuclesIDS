/*
En ocasiones es necesario controlar la condicion con lo llamado contador, que indique las veces que se repetira el bucleç
Ejemplo:
Solicita 10 notas de alumnos y muestra la media

Asegurar que pueda entrar al bucle y que pueda salir
 */

import java.util.Scanner;

public class Explicacion2_While {
    public static void main(String[] args) {
        byte contador=1;
        byte notas=0;
        double mediaNotas=0;
        Scanner sc = new Scanner(System.in);
        while(contador<=10){
            System.out.println("Ingrese la nota "+contador+ ": ");
            notas+=sc.nextByte(); //sumo en notas cada una de ellas
            contador++;
        }
        //el calculo final lo hacemos fuera del bucle...
        mediaNotas=(double) notas /10;
        System.out.println("Media de las notas: "+mediaNotas);






        sc.close();
    }
}
