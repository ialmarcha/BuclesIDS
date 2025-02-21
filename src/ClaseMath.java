import java.util.Scanner;

public class ClaseMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique un número: ");
        int num1 = sc.nextInt();
        System.out.println("Indique otro número: ");
        int num2 = sc.nextInt();
        System.out.println("Math.max-> " +Math.max(num1, num2));
        System.out.println("Math.min-> " +Math.min(num1, num2));
        System.out.println("Raíz cuadrada num1-> " +Math.sqrt(num1));
        System.out.println("Raíz cuadrada num2-> " +Math.sqrt(num2));
        System.out.println("Valor absoluto num1-> " +Math.abs(num1) );
        System.out.println("Valor absoluto num2-> " +Math.abs(num2) );
        //Muy usado
        System.out.println("Exponencial Math.pow(num1, num2)-> " +Math.pow(num1, num2));
        //Random
        //Ejemplo 1: mostrar un número aleatorio del 1 al 10
        int aleatorio=(int)(Math.random()*10);
        System.out.println("Aleatorio es-> "+aleatorio);






    }
}
