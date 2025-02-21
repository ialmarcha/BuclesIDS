import java.util.Scanner;
//menu utilizando bucles y switch-case
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte opcion;
        do {
            System.out.println("Indica tu población: " +
                    "\n 1->Tomelloso " +
                    "\n 2->Alcázar " +
                    "\n 3->La Solana " +
                    "\n 4->Manzanares " +
                    "\n 5->Miguel Esteban " +
                    "\n 6->Mota del Cuervo" +
                    "\n 7->Salir");
            opcion = sc.nextByte();
            switch (opcion) {
                case 1 -> System.out.println("La ciudad del vino");
                case 2 -> System.out.println("Tenemos ave");
                case 3 -> System.out.println("El pueblo más bonito");
                case 4 -> System.out.println("No tiene discoteca! Solo hospital");
                case 5 -> System.out.println("Delincuencia...Ten cuidado");
                case 6 -> System.out.println("el balcón de la Mancha");
                case 7 -> System.out.println("Salida del sistema");
                default -> System.out.println("Opcion invalida");
            }
        }while (opcion != 7);
        sc.close();
    }
}