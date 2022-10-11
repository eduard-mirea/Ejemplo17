import java.util.Scanner;
public class Ejemplo17 {
    public static void main(String[] args) {
        int horas;
        int minutos;
        int segundos;

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce horas: ");
        horas = inputValue.nextInt();

        System.out.println("Introduce minutos: ");
        minutos = inputValue.nextInt();

        System.out.println("Introduce segundos: ");
        segundos = inputValue.nextInt();

        inputValue.close();

        //// añadimos 1 segundo /////

        segundos = segundos + 1;

        if (60 == segundos){
            minutos = minutos + 1;
            segundos = 0;
            if (60 == minutos){
                horas = horas + 1;
                minutos = 0;
                if (24 == horas){
                    horas = 0;
                }
            }
        }
        System.out.println("Horas: " + horas + " ,Minutos: " + minutos + " ,Segundos: " + segundos);
    }
}