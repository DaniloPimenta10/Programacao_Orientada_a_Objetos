package entities;

public class Gerente extends Pessoa {
    String matricula;
    String senha;

    public Gerente(String n, Data i, char s, String c, String mat, String senha){
        super(n, i, s, c);
        this.matricula = mat;
        this.senha = senha;
    }

    public boolean validaAcesso(String s) {
        return this.senha.equals(s);
    }
}
