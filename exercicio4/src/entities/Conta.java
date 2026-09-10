package entities;

public class Conta {
    public String numero;
    public Pessoa titular;
    public double saldo;
    public Gerente ger;
    public Data dataCriacao;

    public Conta(String n, Pessoa t, Gerente g, Data d) {
        this.numero = n;
        this.titular = t;
        this.saldo = 0;
        this.ger = g;
        this.dataCriacao = d;
    }

    public double disponivel() {
        return this.saldo;
    }

    public void depositar ( double valor ) {
        this.saldo += valor ;
        System.out.println (" Deposito de " + valor + " realizado com sucesso .") ;
        System.out.println (" Novo saldo : " + this.saldo);
    }

    public boolean sacar(double valor) {
        if ( valor <= this.disponivel() ) {
            this.saldo -= valor ;
            System.out.println (" Saque de " + valor + " realizado com sucesso .") ;
            System.out.println (" Novo saldo : " + this.saldo) ;
            return true ;
        }

        else {
            System.out.println (" Erro : nao foi possivel sacar " + valor );
            System.out.println (" Valor disponivel para saque : " + this.disponivel()) ;
            return false ;
            }
    }

    public boolean transferir (double valor, Conta destino) {
        if ( this.sacar ( valor ) ) {
            destino.depositar ( valor ) ;
            System.out.println (" Transferencia de " + valor + " realizado com sucesso .") ;
            System.out.println (" Origem : " + this . numero + " - Destino : " + destino.numero ) ;
            return true ;
        }
        else {
            System.out.println (" Erro : nao foi possivel transferir " + valor ) ;
            System . out.println (" Valor disponivel para transferencia : " + this.disponivel() );
            return false ;
        }
    }

    public void extrato() {
        System.out.println("*** EXTRATO DA CONTA ***");
        System.out.println("Conta: " + this.numero);
        System.out.println("Titular: " + this.titular.cpf);
        System.out.println("Valor disponivel para saque: R$" + this.disponivel() + "\n");
    }


}
