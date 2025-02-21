import java.util.Scanner;

/*
 * Pedir por consola un número y dibujar un triángulo rectángulo de n elementos de lado, utilizando para ello 🔷
 * Ejemplo para n=4 lados
 * 🔷🔷🔷🔷
 * 🔷🔷🔷
 * 🔷🔷
 * 🔷
 */
public class TriánguloRectángulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica un número para mostrar el triángulo rectángulo");

        int num = sc.nextInt();     //Leemos el número
        for (int filas=1;filas<=num;filas++){
            for (int columna=filas;columna<=num;columna++){
                System.out.print("🔷");
            }
            System.out.println(); //salto de línea cuando cambie de fila
        }














    }
}
