import java.util.Scanner;

public class JogoAdivinhacao {
    private static Math math;

    public static void main(String[] args) {
        // variáveis
        String jogo;
        int numero;
        int resposta = 101;
        Scanner entrada = new Scanner(System.in);

        // solicitação de start ao usuário
        System.out.println("Começar o jogo?");
        jogo = entrada.nextLine();

        // algorítimo do jogo
        if (jogo.equals("sim") || jogo.equals("Sim") || jogo.equals("SIM")) {

            // gerador de número aleatório
            math.random();
            numero = (int) (Math.random() * 100);

            // solicitação de tentativa de adivinhação ao usuário - sem receber a entrada aqui
            System.out.println("Chute um numero de 1 a 100.");

            // algorítimo do loop
            while (resposta != numero) {

                // armazenando o valor da entrada em 'resposta'
                resposta = entrada.nextInt();

                // condicional das tentativas
                if (resposta == numero) {
                    System.out.println("acertou");
                } else if (resposta < numero) {
                    System.out.println("Tente um número maior");
                } else if (resposta > numero) {
                    System.out.println("Tente um número menor");
                }else {
                    System.out.println("Resposta inválida");
                }

            }
        }else {
            System.out.println("Programa encerrado");
        }
        entrada.close();
    }
}
