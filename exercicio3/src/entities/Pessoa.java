package entities;

public class Pessoa {
    public String nome;
    public String cpf;
    public Data nascimento;
    public char sexo;

    public Pessoa(String n, Data i, char s, String c) {
        System.out.println("Nova pessoa criada no sistema.");
        this.nome = n;
        this.nascimento = i;
        this.sexo = s;
        this.cpf = c;
    }

    public int idade(Data hoje) {
        int idade = hoje.ano - this.nascimento.ano;

        if (hoje.mes < this.nascimento.mes) {
            idade--;
        } else if (hoje.mes == this.nascimento.mes) {
            if (hoje.dia < this.nascimento.dia) {
                idade--;
            }
        }

        return idade;
    }

}
