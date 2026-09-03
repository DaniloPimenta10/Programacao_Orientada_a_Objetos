package entities;

public class Data {
    public int dia;
    public int mes;
    public int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void impData() {
        System.out.printf("%d/%d/%d" , this.dia, this.mes, this.ano);

    } 
}
