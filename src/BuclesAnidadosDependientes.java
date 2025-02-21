/**
 * Se puede dar el caso, que en la ejecución de un programa el bucle interno dependa su recorrido de un valor del bucle externo
 * Ejemplo:
 * for(int i=1;i<=10;i++){
 *          Bloque de instrucciones
 *     for (int j=i;j<=10;j++)   i=1 j=1 - 10 / en la segunda vuelta - i=2 j=2-10 /tercera i=3 j=3-10
 * }
 */
public class BuclesAnidadosDependientes {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("**** Valor de i es: " +i+ " ****");
            for (int j = i; j <= 10; j++) {
                System.out.println("Valor de j es: " +j);
            }
        }


















    }
}
