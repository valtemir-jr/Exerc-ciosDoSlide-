import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        // variáveis
        String senha;
        Boolean acesso = false;
        Scanner entrada = new Scanner(System.in);

        // loop
        do{
            // solicitação da senha
            System.out.println("Digite sua senha: ");
            senha = entrada.nextLine();

            // condicional para confirmação da permissão do acesso
            if (senha.equals("Java21")) {
                System.out.println("Acesso permitido");
                acesso = true;
            }else{
                System.out.println("SENHA INCORRETA!");
                System.out.println("Tente novamente");
            }
        }while (acesso == false);

        // mensagem de bem-vindo
        System.out.println("Seja bem vindo!");

        // fechando scanner
        entrada.close();
    }


}

