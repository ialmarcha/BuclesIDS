/*
    Bucle While ->Sintaxis
    while(condicion) {
        bloque de instrucciones -> Salida de pantallas, if-else, switch, bucles
    }
 */


import java.util.Scanner;

public class ExplicacionWhile {
    public static void main(String[] args) {
    //Solicita la edad, hasta que escribas -1
    int edad=0;
    Scanner sc = new Scanner(System.in);
        while(edad>=0){
            System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        if(edad>=18){
            System.out.println("Eres mayor de edad");
        }else if (edad>=0){
            System.out.println("Eres menor de edad");
        }else{
            System.out.println("Edad no válida");
        }
    }


























    sc.close(); //cerrar el scanner
    }
}
