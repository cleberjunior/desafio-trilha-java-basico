package br.com.dio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        conta.setNumero(scan.nextInt());

        System.out.println("Digite a Agência:");
        conta.setAgencia(scan.next());

        System.out.println("Digite o nome do cliente:");
        conta.setNomeCliente(scan.next());

        System.out.println("Digite o saldo:");
        conta.setSaldo(scan.nextBigDecimal());

        System.out.println("Olá " + conta.getNomeCliente()
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta "
                + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque!"
        );
    }
}
