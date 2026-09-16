package entities;

import java.util.Scanner;

public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente(String n, Pessoa t, Gerente g, Data d){
        super(n, t, g, d);
        this.limite = 200;
    }

    public ContaCorrente(Gerente g) {
        super(g);
        this.limite = 200;
    }

    protected double disponivel(){
        return super.disponivel() + this.limite;
    }

    public void chequeEspecial(double juros) {
        if (saldo < 0)
            this.saldo += (this.saldo * juros) / 100;
    }

    public void alterarLimite() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Conferindo gerente: ");
        
        if (this.ger.validaAcesso()) {
            System.out.println("Informe o novo limite: ");
            this.limite = sc.nextDouble();
        }
        else {
            System.out.println("Senha recusada.");
            System.out.println("Alteração não concluida.");
        }
        sc.close();    
    }

    public void extrato(double j) {
        System.out.println("*** EXTRATO DA CONTA CORRENTE ***");
        super.extrato();
        
    }

}
