/**
 * Se trata de tener dos bucles que no dependen uno del otro...
 * for (int i=1;i<=10;i++){  i=1
 *          Bloque de instrucciones
 *     for(int j=1;j<=10;j++){  i=1 ..j=1
 *          Bloque de instrucciones
 *     }
 * }
 */
public class BuclesAnidadosIndependientes   {
    public static void main(String[] args) {
        //TABLA DE MULTIPLICAR
        for (int i=1;i<=10;i++) {
            System.out.println("*** TABLA DEL " +i+ " ***");
            for (int j=1;j<=10;j++) {
                System.out.println(i+ "x" +j+ "=" +(i*j));
            }
        }















    }
}
