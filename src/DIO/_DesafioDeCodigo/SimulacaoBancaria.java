package src.DIO._DesafioDeCodigo;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        System.out.println("Escolha a opção: 1(Deposito) / 2(Saque) / 3(Saldo Atual)");
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.print("Digite o valor a ser Depositado!!!: ");
                    double depositado = scanner.nextDouble();
                    saldo += depositado;
                    System.out.println("Saldo Atual: " + saldo);
                    break;

                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.print("Digite o valor a ser Sacado!!!: ");
                    double sacar = scanner.nextDouble();
                    if(sacar <= saldo){
                        saldo -= sacar;
                        System.out.println("Saldo atual: " + saldo);
                    }else{
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 3:
                // TODO: Exibir o saldo atual da conta.
                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
