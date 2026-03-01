public class Question5 {

    private static  void existItemsRepeat(int[] list){
        for (int i : list) {
            int qtdeRepetidos =0;
            for (int j : list) {
                if(i == j) qtdeRepetidos++;
            }

            if(qtdeRepetidos > 1){
                System.out.println("Valores duplicados");
                return;
            }
        };

        System.out.println("Valores únicos");
    }

    public static void main(){
        int[] notas = {1, 2, 3, 4, 9,9};

        existItemsRepeat(notas);

    }
}
