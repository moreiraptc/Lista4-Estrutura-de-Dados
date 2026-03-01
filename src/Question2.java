import java.util.Scanner;

public class Question2 {


    //função para calcular quantidade das notas
    private static void calculteReturnValue(int valueBank){

        int notas50 = valueBank / 50;
        int notas20 = (int) ((valueBank % 50) / 20);
        double resto20  =  (valueBank % 50) % 20;

        int notas10 = (int) (resto20 / 10);

        System.out.println(notas50 + " notas de R$ 50,00, " + notas20 + " notas de R$ 20,00, e " + notas10 + "notas de R$ 10,00");

    }

    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor");
        int valorSaque = sc.nextInt();

        calculteReturnValue(valorSaque);


    }

}
