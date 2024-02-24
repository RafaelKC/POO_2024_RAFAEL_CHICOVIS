import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATV7();
    }

    private  static void ATV1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey, what's ur name?");
        while(scan.hasNextLine()){
            String userName = scan.nextLine();
            String out = String.format("Hello, %s", userName);
            System.out.println(out);
        }
        scan.close();
    }
    private  static void ATV5() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("=== Conversor de Celsius para Fahrenheit ===");
        System.out.print("Digite o em Celsius: ");
        int celsius = scan.nextInt();
        int Fahrenheit = (int) ((celsius*1.8)+32);
        System.out.println(celsius + "° Celsius equivale a " + Fahrenheit + "° Fahrenheit");

        scan.close();
    }

    private  static void ATV6() {
        System.out.println(" ");
        Scanner scan = new Scanner(System.in);
        System.out.println("=== Dado D6 vitual ===");
        System.out.print("Rodar dado?: ");
        String resposta = scan.nextLine();

        while (resposta.equals("sim") || resposta.equals("Sim")){
            int int_random = (int)Math.floor(Math.random() * (6 - 1 + 1) + 1);
            System.out.println("resultado: " + int_random);
            System.out.println(" ");
            System.out.print("Rodar dado novamente?: ");
            resposta = scan.nextLine();

        }

    }

    private  static void ATV7() {
        System.out.println(" ");
        Scanner scan = new Scanner(System.in);
        System.out.println("=== Pedra, Papel, tesoura ===");
        System.out.println(" ");
        System.out.println("1. Pedra ");
        System.out.println("2. Papel");
        System.out.println("3. Tesoura");
        System.out.print("Esolha uma opção pelo indice: ");
        int resposta = scan.nextInt();

        String[] opcoes = {"hahahahahahaha", "Pedra", "Papel", "Tesoura"};
        int int_random = (int)Math.floor(Math.random() * (2 - 0 + 0) + 0);
        System.out.println("Você: " + opcoes[resposta]);
        System.out.println("Maquina: " + opcoes[int_random]);
        System.out.println(" ");

        if(opcoes[resposta].equals(opcoes[int_random])){
            System.out.println("Empate!!");
        } else if (resposta==1 &&int_random==2) {
            System.out.println("Você perdeu!!");
        }else if (resposta==1 &&int_random==3) {
            System.out.println("Você Ganhou!!");
        }else if (resposta==2 &&int_random==1) {
            System.out.println("Você Ganhou!!");
        }else if (resposta==2 &&int_random==3) {
            System.out.println("Você Perdeu!!");
        }else if (resposta==3 && int_random==1) {
            System.out.println("Você Perdeu!!");
        }else if (resposta==3 &&int_random==2) {
            System.out.println("Você Ganhou!!");
        }


    }

}