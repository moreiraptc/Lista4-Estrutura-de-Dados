public class Question6 {
    public static void invertList(int[] listArray){
        for (int k = listArray.length -1; k >=0 ; k--) {
            System.out.println(listArray[k]);
        }
    }
    public static void main(){
        int[] list = {10,20,30,40,50};
        invertList(list);
    }
}
