import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao banco GS");

        System.out.println("Por favor insira seu nome");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor insira seu saldo");
        double saldoCliente = scanner.nextInt();

        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Tipo de conta: Corrente");
        System.out.println("Saldo inicial: R$ " + saldoCliente);
        System.out.println("***********************");

        int fimOperacao = 1;

        while (fimOperacao == 1) {

            System.out.println("Operações");

            System.out.println("1- Consultar saldo");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");

            System.out.println("Digite a opção desejada:");
            int operacao = scanner.nextInt();

            switch (operacao) {
                case 1: {
                    System.out.println("O saldo atual é de: R$ " + saldoCliente);
                } break;
                case 2: {
                    System.out.println("Informe o valor a receber: ");
                    double recebeValor = scanner.nextDouble();
                    System.out.println("Saldo atualizado: R$ " + (saldoCliente + recebeValor));
                    saldoCliente += recebeValor;
                }break;
                case 3: {
                    System.out.println("Informe o valor a transferir: ");
                    double transfereValor = scanner.nextDouble();
                        if (transfereValor > saldoCliente) {
                            System.out.println("Não há saldo suficiente para fazer essa transferência.");
                        } else {
                            System.out.println("Saldo atualizado: R$ " + (saldoCliente - transfereValor));
                            saldoCliente -= transfereValor;
                        }
                }break;
                case 4: {
                    System.out.println("Obrigado por ser nosso cliente");
                    fimOperacao = 2;
                }break;
                default: {
                    System.out.println("Operação inválida");
                }
            }
        }
    }
}