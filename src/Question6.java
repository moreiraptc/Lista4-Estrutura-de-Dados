public class Question6 {
    public static void invertList(int[] list){
        int[] listInverter = list;
        int endList = listInverter.length -1;

        for (int i = 0; i < listInverter.length / 2; i++) {
            int auxItem = listInverter[i];
            listInverter[i] = listInverter[endList];
            listInverter[endList] = auxItem;

            endList--;
        }

        for (int i = 0; i <= listInverter.length -1; i++) {
            System.out.println(listInverter[i]);
        }

    }
    public static void main(){
        int[] list = {10,20,30,40,50};
        invertList(list);
    }
}
