import java.util.Scanner;/*essa linha*/

public class Main {
    public static void main(String[] args) {

        //exercicio1();
        exercicio2(args);
        //exercicio3();
    }

    public static void exercicio1() {
        Scanner pessoa = new Scanner(System.in);
        System.out.println("Entre com o seu nome: ");
        String nome;
        nome = pessoa.next();
        System.out.println("Entre com o ano que nasceu: ");
        int ano_b;
        ano_b = pessoa.nextInt();
        System.out.println("Entre com o ano atual: ");
        int ano;
        ano = pessoa.nextInt();

        int ano_atual = ano - ano_b;

        System.out.println(nome + ", possui " + ano_atual + " anos");
    }

    public static void exercicio2(String[] args) {
        if (args.length != 3) {
            System.out.println("Uso: java app <projeto1> <projeto2> <participacao>");
            return;
        }

        double projeto1 = Double.parseDouble(args[0]);
        double projeto2 = Double.parseDouble(args[1]);
        double participacao = Double.parseDouble(args[2]);

        int w1 = 2;
        int w2 = 3;

        double MP = (w1 * projeto1 + w2 * projeto2) / (w1 + w2);

        double CF = (MP * 0.9) + (participacao * 0.1);

        System.out.println("Conceito final: " + CF);
        if (CF >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

    }

    public static void exercicio3() {
        Scanner notas = new Scanner(System.in);
        System.out.println("Entre com a quantidade de alunos: ");
        int n = notas.nextInt();
        notas.nextLine();
        System.out.println("Entre com a nota dos alunos separadas por espaço: ");
        String[] notas_alunos = notas.nextLine().split(" ");

        int[] asterisco = new int[4];

        for (String nota_string : notas_alunos) {
            int nota = Integer.parseInt(nota_string);
            if (nota >= 0 && nota <= 2) {
                asterisco[0]++;
            } else if (nota >= 3 && nota <= 5) {
                asterisco[1]++;
            } else if (nota >= 6 && nota <= 8) {
                asterisco[2]++;
            } else if (nota >= 9 && nota <= 10) {
                asterisco[3]++;
            }
        }

        System.out.println("0 - 2 | " + "*".repeat(asterisco[0]));
        System.out.println("3 - 5 | " + "*".repeat(asterisco[1]));
        System.out.println("6 - 8 | " + "*".repeat(asterisco[2]));
        System.out.println("9 - 10 | " + "*".repeat(asterisco[3]));

    }
}