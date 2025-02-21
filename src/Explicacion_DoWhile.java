/*
Bucle Do-While
Sintaxis:
do{
    Bloque de instrucciones

}while(condicion);
 *** Se ejecuta al menos una vez ***
 */

import java.util.Scanner;

public class Explicacion_DoWhile {
    public static void main(String[] args) {
        int edad=18;
        Scanner sc = new Scanner(System.in);
        do{     //ejecuta este bloque de instrucciones
            System.out.println("Ingrese su edad: ");
            edad = sc.nextInt();
        }while(edad<18);        //mientras se cumpla esta condicion
        System.out.println("La edad introducida es: "+edad);


    }
}
