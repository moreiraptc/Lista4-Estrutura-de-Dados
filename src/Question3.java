import java.util.Scanner;

public class Question3 {

    private static boolean containCaracterPassword(String password){
        return password.contains("@") ||
                password.contains("#")||
                password.contains("$")||
                password.contains("%")||
                password.contains("&");
    }

    private static boolean validLengthPassword(String password){
        if(password.length() < 8){
            System.out.println("\nA senha não possui 8 dígitos\n");
            return false;
        }else {
            return true;
        }

    }

    private static  void validPassword(String password){
        if(containCaracterPassword(password)){
            System.out.println("\nSenha válida");
        }else {
            System.out.println("\nSenha inválida. Não contém caracteres especiais");
        }
    }

    public static void main(){

        Scanner sc = new Scanner(System.in);
        String senha = "";

        System.out.println("Digite a senha");
        senha = sc.nextLine();

        if(validLengthPassword(senha)){
            validPassword(senha);
        }

    }

}
