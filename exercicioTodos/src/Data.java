import java.util.Scanner;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia: ");
        this.dia = sc.nextInt();
        System.out.println("Digite o mês: ");
        this.mes = sc.nextInt();
        System.out.println("Digite o ano: ");
        this.ano = sc.nextInt();

        sc.close();
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    
    public void impData() {
        System.out.printf("%d/%d/%d" , this.dia, this.mes, this.ano);

    }
    
    public boolean maior(Data d2){
        if(this.ano > d2.ano)
            return true;
        
        else if(this.ano == d2.ano){
            if (this.mes > d2.mes)
                return true;
            
            else if(this.mes == d2.mes){
                if (this.dia > d2.dia)
                    return true;
                else 
                    return false;
            }
            else 
                return false;
        } 

        else
            return false;
    }
}
