public class Programa {
    public static void main(String[] args) {
        System.out.println("=== INICIANDO O SISTEMA BANCARIO ===");

        System.out.println("\n--- Cadastro de Pessoas ---");
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        Pessoa p4 = new Pessoa();

        System.out.println("\n--- Cadastro de Gerentes ---");
        Gerente g1 = new Gerente();
        Gerente g2 = new Gerente();

        System.out.println("\n--- Criação de Contas Correntes ---");
        ContaCorrente cc1 = new ContaCorrente(g1);
        ContaCorrente cc2 = new ContaCorrente(g2);

        System.out.println("\n--- Criação de Contas Poupança ---");
        ContaPoupanca cp1 = new ContaPoupanca(g1);
        ContaPoupanca cp2 = new ContaPoupanca(g2);

        System.out.println("\n=== TESTANDO MOVIMENTAÇÕES FINANCEIRAS ===");

        System.out.println("\n[Conta Corrente 1]");
        cc1.depositar(500.0);
        cc1.sacar(100.0);
        cc1.extrato(0);

        System.out.println("\n[Conta Corrente 2]");
        cc2.depositar(1000.0);
        cc1.transferir(200.0, cc2);
        cc2.extrato(0);

        System.out.println("\n[Conta Poupança 1]");
        cp1.depositar(300.0);
        cp1.sacar(50.0);
        cp1.rendimento(1.0);
        cp1.extrato();

        System.out.println("\n[Conta Poupança 2]");
        cp2.depositar(1500.0);
        cp1.transferir(50.0, cp2);
        cp2.extrato();

        System.out.println("\n=== FIM DOS TESTES DO SISTEMA ===");
    }
}