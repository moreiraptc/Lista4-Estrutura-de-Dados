public class Question1 {

    private static  double sumValueList(double[] notas){
        double sumNote = 0;
        for (double v : notas) {
            sumNote += v;
        }
        return sumNote;
    };


    private static double mediaList(double[] notas){
        return sumValueList(notas) / notas.length;
    }


    private static int studentsMedia(double[] notas){
        int alunosMedia = 0;
        double media = mediaList(notas);

        for (double nota : notas) {
            if (nota > media) alunosMedia++;
        }
        return alunosMedia;
    }

    private static  double higherGrade(double[] notas){
        double notaMaior =0;

        for (double nota : notas) {
            if(nota > notaMaior) notaMaior = nota;
        }

        return notaMaior;
    };


    public static void main(){
        double[] notas = {7.5, 4.0, 9.2, 5.5, 8.0, 6.5, 3.2, 10.0, 7.0, 5.8};

        System.out.println("Media:  " + mediaList(notas));
        System.out.println("Alunos acima da media: " + studentsMedia(notas));
        System.out.println("Nota maior: " + higherGrade(notas));
    }
}
