import java.util.Scanner;

/*
 *Ejercicio:
 * Crea una aplicacion para calcular los datos estadísticos de las edades de los alumnos de un centro educativo.
 * Se indicaran las edades hasta que se indique un dato negativo. //<0
 *  1. La suma de todas las edades          - contadorEdad
 *  2. La media de las edades               - calculo final
 *  3. El número de los alumnos ingresados  - contadorAlumnos
 *  4. Cuántos son mayores de edad          - if
 */
public class Ejercicio2_While {
    public static void main(String[] args) {
        //declaración de variable
        Scanner sc = new Scanner(System.in);
        int edad=0,contadorEdad=0, contadorAlumnos=0, mayorEdad=0;
        double mediaEdad;

        while(edad>=0){
            System.out.println("Ingrese su edad: ");
            edad = sc.nextInt(); //si se escribe un número negativo... se indica que no puede calcular ---se sale del buble
            if(edad>=0){
                contadorEdad+=edad;
                contadorAlumnos++;
                if(edad>=18) {
                    mayorEdad++;
                }

            }else{
                System.out.println("El programa ha llegado a su fin");
            }

        }
        mediaEdad=(double) contadorEdad/contadorAlumnos;
        System.out.println("Estadística del Alumnado: " +
                "\nTotal edades: "+contadorEdad+
                "\nTotal de Alumnos: " +contadorAlumnos+
                "\nMedia: "+mediaEdad+
                "\nMayor de Edad: "+mayorEdad);


    }
}
