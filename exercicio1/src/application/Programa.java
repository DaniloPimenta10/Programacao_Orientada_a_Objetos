package application;

import entities.Conta;
import entities.Pessoa;

public class Programa {
    public static void main(String[] Args) {

        Pessoa p1 = new Pessoa();
        Conta c1 = new Conta();

        p1.cpf = "123.787.477-56";
        p1.nome ="Tarciso";
        p1.idade = 19;
        p1.sexo = 'M';

        c1.numero ="1245-2";
        c1.titular = p1;
        c1.saldo = 203.51;
        c1.limite = 500;

        System.out.println("*** EXTRATO DA CONTA ***");
        System.out.println("Conta: " + c1.numero);
        System.out.println("Titular: " + c1.titular.nome + " (" + c1.titular.cpf + ")");
        System.out.println("Saldo disponível para saque: R$ " + c1.saldo);



    }

}
