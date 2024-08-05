import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro parâmetro: ");
        int primeiroParametro = scanner.nextInt();
        System.out.print("Informe o segundo parâmetro: ");
        int segundoParametro = scanner.nextInt();
        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e){
            System.err.println("O segundo parâmetro deve ser maior que o primeiro!");
        }

    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();
        int contagem = parametroDois - parametroUm;
        System.out.println("Contaremos até o número "+contagem);
        for (int i=1; i <= contagem; i++){
            System.out.println("Imprimindo o número "+i);
        }
    }
}
