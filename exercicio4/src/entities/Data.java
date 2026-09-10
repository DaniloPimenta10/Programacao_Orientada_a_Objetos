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
