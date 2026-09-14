package entities;

public class ContaCorrente extends Conta{
    public double limite;

    public ContaCorrente(String n, Pessoa t, Gerente g, Data d){
        super(n, t, g, d);
        this.limite = 200;
    }

    public double disponivel(){
        return this.saldo + this.limite;
    }

    public void chequeEspecial(double juros) {
        if (saldo < 0)
            this.saldo += (this.saldo * juros) / 100;
    }

}
