import java.util.Scanner;

public class Ejercicio_A6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int respuesta=0;
        int aleatorio=(int)(Math.random()*100);
        int intentos=1;

        while(aleatorio!=respuesta && respuesta!=-1){
            System.out.println("Introduzca un numero");
            respuesta= sc.nextInt();
            if(respuesta>aleatorio){
                System.out.println("El numero es menor que " +respuesta);
            }else if(respuesta==-1){
                System.out.println("Te rendiste ＞﹏＜ , el número era: "+aleatorio);
            }else if(respuesta<aleatorio){
                System.out.println("El numero es mayor que " +respuesta);
            }else{
                System.out.println( "\n" +
                        "┏┓┏┓┏┓┳┓┏┳┓┏┓┏┓┏┳┓┏┓╻\n" +
                        "┣┫┃ ┣ ┣┫ ┃ ┣┫┗┓ ┃ ┣ ┃\n" +
                        "┛┗┗┛┗┛┛┗ ┻ ┛┗┗┛ ┻ ┗┛•\n" +
                        "                    ");


            }
        }






















    }
}
