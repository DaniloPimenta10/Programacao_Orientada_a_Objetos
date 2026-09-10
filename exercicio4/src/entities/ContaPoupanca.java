package entities;

public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(String n, Pessoa t, Gerente g, Data d) {
        super(n, t, g, d);
    }

    public void rendimento(double j){
        this.saldo = (this.saldo *j/100);

    }
}
