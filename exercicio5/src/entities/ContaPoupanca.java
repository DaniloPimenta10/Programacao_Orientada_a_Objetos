package entities;

public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(String n, Pessoa t, Gerente g, Data d) {
        super(n, t, g, d);
    }

    public ContaPoupanca(Gerente g) {
        super(g);
    }

    public void extrato() {
        System.out.println("*** EXTRATO DA CONTA ***");
        System.out.println("Conta: " + this.numero);
        System.out.println("Titular: " + this.titular.cpf);
        System.out.println("Valor disponivel para saque: R$" + this.disponivel() + "\n");
    }

    public void rendimento(double j){
        this.saldo = (this.saldo *j/100);

    }
}
