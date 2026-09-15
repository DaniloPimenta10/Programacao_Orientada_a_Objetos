package entities;

import java.util.Scanner;

public class Gerente extends Pessoa {
    String matricula;
    String senha;

    public Gerente(String n, Data i, char s, String c, String mat, String senha){
        super(n, i, s, c);
        this.matricula = mat;
        this.senha = senha;
    }

    public Gerente() {
        super();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a matricula do gerente: ");
        this.matricula = sc.next();

        this.senha = "123456";
        
        sc.close();
    }

    public boolean validaAcesso(String s) {
        return this.senha.equals(s);
    }

    public boolean validaAcesso() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        String s = sc.nextLine();
        sc.close();
        return this.senha.equals(s);
    }
}
