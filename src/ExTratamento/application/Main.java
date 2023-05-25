package ExTratamento.application;

import ExTratamento.entities.Conta;
import ExTratamento.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados da conta: ");
        System.out.print("Numero da conta: ");
        int numeroDaConta = sc.nextInt();
        System.out.print("Titular da conta: ");
        String nomeDoTitular = sc.next();
        System.out.print("Saldo Inicial: ");
        sc.next();
        double saldoInicial = sc.nextDouble();
        System.out.print("Limite do saque: ");
        double limiteDoSaque = sc.nextDouble();
        ;
        Conta conta = new Conta(numeroDaConta, nomeDoTitular, saldoInicial, limiteDoSaque);

        System.out.print("Entre com o valor a sacar: ");
        double valor = sc.nextDouble();
        try {
            conta.saque(valor);
            System.out.print("Novo saldo da conta: " + conta.getSaldo());
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }

















        sc.close();


    }
}
