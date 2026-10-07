import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private ArrayList <ContaCorrente> contasCorrentes = new ArrayList<>();
    private ArrayList <ContaPoupanca> contasPoupancas = new ArrayList<>();
    private ArrayList <Gerente> gerentes = new ArrayList<>();
    private ArrayList <Pessoa> clientes = new ArrayList<>();
    

    public Sistema () {
        this.gerentes = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.contasCorrentes = new ArrayList<>();
        this.contasPoupancas = new ArrayList<>();
    }
    
    public void CadastrarGerente(Gerente g) {
        this.gerentes.add(g);
    }

    public void CadastrarCliente(Pessoa p) {
        this.clientes.add(p);
    }

    public void CadastrarContaCorrente(ContaCorrente c) {
        this.contasCorrentes.add(c);
    }

    public void CadastrarContaPoupanca(ContaPoupanca c) {
        this.contasPoupancas.add(c);
    }

    public ArrayList<ContaCorrente> getContasCorrentes() {
        return contasCorrentes;
    }

    public ArrayList<ContaPoupanca> getContasPoupancas() {
        return contasPoupancas;
    }

    public ArrayList<Gerente> getGerentes() {
        return gerentes;
    }

    public ArrayList<Pessoa> getClientes() {
        return clientes;
    }

    
    public void menu (Scanner input){
        
        String msg = "*******************\n" +
        "Escolha uma opção: \n" +
        "1) Cadastro\n" +
        "2) Movimentações financeiras\n" +
        "0) Sair \n" +
        "*******************\n"
        ;

        int op = Entrada.lerInteiro(msg, input);

        while (op < 0 || op > 2) {
            System . out . println (" Opcao invalida . Tente novamente : ") ;
            op = Entrada.lerInteiro(msg, input);
        }

        while (op != 0){
            if(op == 1)
                cadastro(input);
            if(op == 2);

            op = Entrada.lerInteiro(msg, input);

        }

        System.out.println("Saindo...");
    }

    public void cadastro(Scanner input){
        
        String msg = "*******************\n" +
        "a) Adicionar pessoa" +
        "b) Adicionar gerente" +
        "c) Criar conta corrente" +
        "d) Criar poupança" +
        "*******************\n";

        String opcao = Entrada.lerLinha(msg, input);

        while (opcao != "a" || opcao != "b" || opcao != "c" || opcao != "d") {
            System . out . println (" Opcao invalida . Tente novamente : ") ;
            opcao = Entrada.lerLinha(msg, input);
        }        

        if (opcao == "a") {
            Pessoa p = new Pessoa();
            CadastrarCliente(p);
        }

        if (opcao == "b") {
            Gerente g = new Gerente();
            CadastrarGerente(g);
        }
    
        if (opcao == "c") {
            ContaCorrente c = new ContaCorrente();
            CadastrarContaCorrente(c);
        }
        
        if (opcao == "d") {
            ContaPoupanca c = new ContaPoupanca();
            CadastrarContaPoupanca(c);
        }   
    
    }

    public void operacoes(Scanner input) {

        String msg = "*******************\n" +
        "a) Verificar extrato" +
        "b) Depositar" +
        "c) Sacar" +
        "d) Transferir";

    }

}
