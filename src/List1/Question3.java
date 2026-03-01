package List1;

import java.util.Scanner;

public class Question3 {

    public static boolean containCaracterPassword(String password){
        return password.contains("@") ||
                password.contains("#")||
                password.contains("$")||
                password.contains("%")||
                password.contains("&");
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String senha = "";

        System.out.println("Digite a senha");
        senha = sc.nextLine();

        if(senha.length() < 8){
            System.out.println("\nA senha não possui 8 dígitos\n");
            return;
        }


        if(containCaracterPassword(senha)){
            System.out.println("\nSenha válida");
        }else {
            System.out.println("\nSenha inválida. Não contém caracteres especiais");
        }


    }

}
