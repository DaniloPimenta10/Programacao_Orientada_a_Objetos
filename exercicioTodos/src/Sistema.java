import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private ArrayList<Conta> contas = new ArrayList<>();
    private ArrayList <Gerente> gerentes = new ArrayList<>();
    private ArrayList <Pessoa> clientes = new ArrayList<>();
    

    public Sistema () {
        this.gerentes = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }
    
    public void CadastrarGerente(Gerente g) {
        this.gerentes.add(g);
    }

    public void CadastrarCliente(Pessoa p) {
        this.clientes.add(p);
    }

    public void cadastrarConta(Conta c) {
        this.contas.add(c);
    }

    public ArrayList<Conta> getContas() {
            return contas;
        }

    public ArrayList<Gerente> getGerentes() {
        return gerentes;
    }

    public ArrayList<Pessoa> getClientes() {
        return clientes;
    }

    public Gerente procuraGerente(String mat) {
        
        for (int i = 0; i < gerentes.size(); i++){
            Gerente g = gerentes.get(i);
            if (mat.equals(g.getMatricula()))
                return gerentes.get(i);
        }
        
        return null;
    }
    
    public Conta procuraConta(String n) {
        
        for (int i = 0; i < contas.size(); i++){
            Conta c = contas.get(i);
            if (n.equals(c.getNumero()))
                return contas.get(i);
        }
        
        return null;
    }

    public static int menu (Scanner input){
        
        String msg = "*******************\n" +
        "Escolha uma opção: \n" +
        "1) Cadastro\n" +
        "2) Movimentações financeiras\n" +
        "0) Sair \n" +
        "*******************\n"
        ;

        int op = Entrada.lerInteiro(msg, input);

        while (op < 0 || op > 2) {
            System.out.println (" Opcao invalida . Tente novamente : ") ;
            op = Entrada.lerInteiro(msg, input);
        }

        return op;

        // while (op != 0){
        //     if(op == 1)
        //         cadastro(input);
        //     if(op == 2);

        //     op = Entrada.lerInteiro(msg, input);

        // }

        // System.out.println("Saindo...");
    }

    public void cadastro(Scanner input){
        
        String msgGerente = "Indique a matrícula do gerente: ";

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
            
            String mat = Entrada.lerLinha(msgGerente, input);
            Gerente g = procuraGerente(mat);

            ContaCorrente c = new ContaCorrente(g);  //como colocar o gerente
            cadastrarConta(c);
        }
        
        if (opcao == "d") {

            String mat = Entrada.lerLinha(msgGerente, input);
            Gerente g = procuraGerente(mat);
            ContaPoupanca c = new ContaPoupanca(g); //como colocar o gerente?
            cadastrarConta(c);
        }   
    
    }

    public void operacoes(Scanner input) {

        String msgNum = "Indique o número da conta: ";

        String msg = "*******************\n" +
        "a) Verificar extrato" +
        "b) Depositar" +
        "c) Sacar" +
        "d) Transferir";

        String opcao = Entrada.lerLinha(msg, input);

        while (opcao != "a" || opcao != "b" || opcao != "c" || opcao != "d") {
            System . out . println (" Opcao invalida . Tente novamente : ") ;
            opcao = Entrada.lerLinha(msg, input);
        } 

        if (opcao == "a") {
            String n = Entrada.lerLinha(msgNum, input);
            Conta c = procuraConta(n);
            c.extrato(); //
        }

        if (opcao == "b") {
            
            String n = Entrada.lerLinha(msgNum, input);
            Conta c = procuraConta(n);
            
            Double v = Entrada.lerDouble("Informe o valor do depósito: ", input);
            c.depositar(v);
        }
    
        if (opcao == "c") {
            
            String n = Entrada.lerLinha(msgNum, input);
            Conta c = procuraConta(n);
            
            Double v = Entrada.lerDouble("Informe o valor do saque: ", input);
            c.sacar(v);
        }
        
        if (opcao == "d") {
            String n = Entrada.lerLinha("Indique o número da conta que vai enviar: ", input);
            Conta c1 = procuraConta(n);
            
            n = Entrada.lerLinha("Indique o número da conta que vai receber: ", input);
            Conta c2 = procuraConta(n);

            Double v = Entrada.lerDouble("Informe o valor da transferencia: ", input);
            c1.transferir(v , c2);
        }  

    }

}
