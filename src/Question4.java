import java.util.Scanner;

public class Question4 {

    private static void calcMinutesTime(int seconds){
        int secondDay = 3600;

        int horas = seconds / secondDay ;
        int minutos = (int) ((seconds % 3600) / 60);
        int minutosResto = (int) ((seconds % 3600) % 60);

        System.out.println(horas + ":" + minutos + ":" + minutosResto);
    }

    public static void main(){
        System.out.println("Digite o valor em segundos");
        Scanner sc = new Scanner(System.in);

        calcMinutesTime(sc.nextInt());
    }
}
