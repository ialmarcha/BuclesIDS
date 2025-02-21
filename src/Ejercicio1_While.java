import java.util.Scanner;

/*
 * Solicita al usuario un número, e indica si es par, si es positivo
 * para salir del programa el usuario debe pulsar 0
 * Pistas -> numero%2==0 para saber si es par
 *           numero>0    para saber si es positivo / sino es negativo
 */


public class Ejercicio1_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declaro la variable numero y lo igualo a 1
        int numero=1;
        //pongo while para que mientras que el numero sea distinto de 0 siga en bucle
        while (numero!=0)  {
            //pido que ingresen un número
            System.out.println("Ingrese un numero");
            numero = sc.nextInt();
            //le doy una condicion de si el modulo del numero es 0 el numero sea par, sino sea impar y he usado if/else
            if (numero%2==0) {
                System.out.println("El número "+numero+ " es par");
            }else{
                System.out.println("El número "+numero+ " es impar");
            }
            //le doy otra condicion para saber si es positivo o negativo
            if (numero>=0){
                System.out.println("El numero "+numero+ " es positivo");
            }else{
                System.out.println("El numero "+numero+ " es negativo");
            }

        }







        sc.close();     //CIERRO EL BUCLE
    }
}
