package application;

import entities.Conta;
import entities.Data;
import entities.Pessoa;

public class Programa {
    public static void main(String[] args) {
        Data dataNasc1 = new Data(15, 5, 2000);
        Data dataNasc2 = new Data(20, 10, 1995);

        Pessoa pessoa1 = new Pessoa("Ana Silva", dataNasc1, 'F', "123.456.789-00");
        Pessoa pessoa2 = new Pessoa("Carlos Souza", dataNasc2, 'M', "987.654.321-11");

        Data hoje = new Data(2, 9, 2026);
        System.out.println("Idade de " + pessoa1.nome + ": " + pessoa1.idade(hoje) + " anos.");

        Conta conta1 = new Conta("001-X", pessoa1, 500.0);
        Conta conta2 = new Conta("002-Y", pessoa2);

        System.out.println("\n--- TESTANDO DEPÓSITOS ---");
        conta1.depositar(1000.0);
        conta2.depositar(300.0);

        System.out.println("\n--- TESTANDO SAQUES ---");
        conta1.sacar(200.0);
        conta1.sacar(2000.0);

        System.out.println("\n--- TESTANDO TRANSFERÊNCIA ---");
        conta1.transferir(150.0, conta2);

        System.out.println("\n--- EXTRATOS FINAIS ---");
        conta1.extrato();
        conta2.extrato();
    }
}