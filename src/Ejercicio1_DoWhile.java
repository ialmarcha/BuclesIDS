import java.util.Scanner;

/**
 *Desarrolla un juego para mejorar el cálculo mental de al suma. El jugador debe introducir el resultado de la suma de dos números que se generan aleatoriamente del 1-100. Mientras la solución respondida por el usuario sea correcta el juego continuará, y se llevará un contador de aciertos
 * En el momento que falle se saldrá del juego e indicará cuantos ha respondido correctamente.
 * Algoritmo
 *  1. declarar Scanner, variables: num1, num2, respuesta, contador
 *  2. Bucle do-while(respuesta==num1+num2) -se pregunta la respuesta y se incrementa el contador siempre y cuando la respuesta sea correcta
 *  3. al salir del bucle, mostrar el contador de aciertos

 */

public class Ejercicio1_DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=0, num2=0, respuesta=0, contador=0;

        do{
            num1=(int)(Math.random()*100);
            num2=(int)(Math.random()*100);
            System.out.println("Suma mentalmente estos dos números: \n"+num1+ "+" +num2);
            respuesta= sc.nextInt();
            if(respuesta==num1+num2) {
                contador++;
                System.out.println("ACERTASTE CON ÉXITO, llevas " +contador+ " aciertos");
            }else{
                System.out.println("FALLASTE");
                System.out.println("Acertaste un total de: " +contador--+ " aciertos");
            }
        }while(respuesta==num1+num2);


        sc.close();









    }
}
