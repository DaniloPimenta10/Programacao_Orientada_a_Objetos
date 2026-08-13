package entities;

public class Conta {
    public String numero;
    public Pessoa titular;
    public double saldo;
    public double limite;

    public void chequeEspecial(double juros) {
        if (saldo < 0)
            this.saldo += (this.saldo*juros) / 100;
        }

}
