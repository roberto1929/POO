import java.util.Scanner;/*essa linha*/

public class Main {
    public static void main(String[] args) {

        Scanner pessoa = new Scanner(System.in);
        System.out.println("Entre com o seu nome: ");
        String nome;
        nome = pessoa.next();
        System.out.println("Entre com o ano que nasceu: ");
        int ano_b;
        ano_b = pessoa.nextInt();
        System.out.println("Entre com o ano atual: ");
        int ano;
        ano=pessoa.nextInt();

        int ano_atual = ano - ano_b;

        System.out.println(nome+ ", possui "+ ano_atual +" anos");
    }



}