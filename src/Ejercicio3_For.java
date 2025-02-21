public class Ejercicio3_For {
    public static void main(String[] args) {
        /*
         * Muestra en pantalla los número múltiplos de 7 desde 0 a 100
         * importante... i++ i-- i+=2 i+=10 i+=7
         * Recordatorio System.out.print(i+"-")
         */

        for (int i=0;i<=100;i++) {
            //System.out.println(7+ "*" +i+ "=" +7*i);  no sirve
            if(i%7==0){
                System.out.println(i);
            }
        }
        for (int i=0;i<=100;i+=7) {
            System.out.print(i+ "-");
        }

    }

}
