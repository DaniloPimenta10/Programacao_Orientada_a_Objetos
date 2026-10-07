import java.util.Scanner;

public class Entrada {
    public static String lerLinha(String msg, Scanner input){
        System.out.print(msg);
        String linha = input.nextLine();
        return linha;
    }

    public static int lerInteiro(String msg, Scanner input) {
        System.out.print(msg);
        int x = input.nextInt();
        return x;        
    }

    public static double lerDouble(String msg, Scanner input) {
        System.out.print(msg);
        int x = input.nextInt();
        return x;         
    }

}
