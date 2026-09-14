package application;

import entities.ContaCorrente;
import entities.ContaPoupanca;
import entities.Data;
import entities.Gerente;
import entities.Pessoa;

public class Programa {
    public static void main(String[] args) {
        Data d1 = new Data(15, 5, 2000);
        Data d2 = new Data(20, 10, 1995);
        Data dGerente = new Data(10, 1, 1985);
        Data dCriacao = new Data(2, 9, 2026);

        Pessoa p1 = new Pessoa("Ana Silva", d1, 'F', "123.456.789-00");
        Pessoa p2 = new Pessoa("Carlos Souza", d2, 'M', "987.654.321-11");
        
        Gerente g1 = new Gerente("Roberto Lima", dGerente, 'M', "111.222.333-44", "M123", "senha123");

        Data h = new Data(2, 9, 2026);
        System.out.println("Idade de " + p1.nome + ": " + p1.idade(h) + " anos.");

        ContaCorrente cc1 = new ContaCorrente("001-X", p1, g1, dCriacao);
        ContaPoupanca cp1 = new ContaPoupanca("002-Y", p2, g1, dCriacao);

        System.out.println("\n--- TESTANDO DEPÓSITOS ---");
        cc1.depositar(1000.0);
        cp1.depositar(500.0);

        System.out.println("\n--- TESTANDO SAQUES ---");
        cc1.sacar(200.0);
        cp1.sacar(100.0);

        System.out.println("\n--- TESTANDO TRANSFERÊNCIA ---");
        cc1.transferir(150.0, cp1);

        System.out.println("\n--- TESTANDO GERENTE E RENDIMENTO ---");
        System.out.println("Acesso do gerente válido? " + g1.validaAcesso("senha123"));
        cp1.rendimento(1.0);

        System.out.println("\n--- EXTRATOS FINAIS ---");
        cc1.extrato();
        cp1.extrato();
    }
}