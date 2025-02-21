import java.util.Scanner;

/**
 * Solicita 6 notas al usuario de los alumnos del instituto y según la siguiente valoración muestra al final de la ejecución
 * los aprobadoses (es <=5)
 * los condicionados (los que tienen nota de 4) (es==4)
 * los suspensos (es<4 && <=0)
 * pista:
 * tenemos tres contadores
 * for.. for (int i=1;-.....
 * while (contador<=6)
 *      contador++
 */
public class EjercicioBucleCondicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aprobados=0;
        int suspensos=0;
        int condicionados=0;
        int alumnos=0;
        double notaMedia=0;
        double nota = 0;

        for (int i=1;i<=6;i++){
            alumnos++;
            System.out.println("Ingrese la nota del alumno "+alumnos+ ":");
            nota = sc.nextDouble();
            notaMedia+=nota;
            if(nota>=5){
                aprobados++;
            }else if(nota==4){
                condicionados++;
            }else {
                suspensos++;
            }

        }

        System.out.println(
                    "⭐ ⭐ ⭐ ⭐ ⭐ ⭐" +
                "\t\n⭐_ESTADÍSTICAS_⭐" +
                "\t\n⭐ ⭐ ⭐ ⭐ ⭐ ⭐" +
                "\nEl número de aprobados son: "+aprobados+ " ✅"+
                "\nEl número de condicionados  son: "+condicionados+ "️️ ⁉️"+
                "\nEl número de suspensos  son: "+suspensos+ "️ ️❌");
        System.out.println("La nota media de los alumnos es: "+notaMedia/6);




    }
}
