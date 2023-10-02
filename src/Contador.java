import java.util.Scanner;

public class Contador {


    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanf.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanf.nextInt();

        try {

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro ");

        }

    }


    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {


        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();

        } else {

            int contagem = parametroDois - parametroUm;
            for (int cont = 1; cont <= contagem; cont++) {
                System.out.println("Imprimindo o numero " + contagem);
            }

        }
    }

}
