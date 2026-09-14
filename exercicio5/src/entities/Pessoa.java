package entities;

import java.util.Scanner;

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

        public Pessoa() {
          
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Digite o nome: ");
            this.nome = sc.nextLine();
            
            System.out.println("Digite a data de nascimento: ");
            this.nascimento = new Data();
            
            System.out.println("Digite o sexo (F/M): ");
            this.sexo = sc.next().charAt(0);
            
            System.out.println("Digite o CPF: ");
            this.cpf = sc.nextLine();

            sc.close();
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
