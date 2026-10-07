public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(String n, Pessoa t, Gerente g, Data d) {
        super(n, t, g, d);
    }

    public ContaPoupanca(Gerente g) {
        super(g);
    }

    public void extrato() {
        System.out.println("*** EXTRATO DE POUPANCA ***");
        super.extrato();
        
    }

    public void rendimento(double j){
        this.saldo = (this.saldo *j/100);

    }
}
