import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATV7();
    }

    private  static void ATV1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey, what's ur name?");
        String userName = scan.nextLine();
        String out = String.format("Hello, %s", userName);
        System.out.println(out);
        scan.close();
    }

    private static void ATV2(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scan.nextInt();
        if (numero  > 0 ){
            System.out.println("Seu número é positivo!");
        } else if (numero == 0) {
            System.out.println("Seu número é igual a 0!");
        } else {
            System.out.println("Seu número é negativo!");
        }
    }

    private static void ATV3(){
        Scanner scan = new Scanner(System.in);
        double numeros[];
        double soma = 0;
        numeros = new double[3];
        for (int i=0;i<3;i++){
            System.out.println("Digite os números para calcular a média: ");
            numeros[i] = scan.nextDouble();
            soma += numeros[i];
        }

        double media = soma / numeros.length;
        System.out.println("A média de " + Arrays.toString(numeros) + " é: " + media);

    }

    private static void ATV4(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();
        if (idade  > 18 ){
            System.out.println("Você é maior de idade!");
        } else if (idade < 18) {
            System.out.println("Voce é menor de idade");
        }
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

    private  static void ATV8() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o número:");

        int number = scan.nextInt();
        scan.close();
        int out = 1;
        while (number > 0) {
            out = out * number;
            number -= 1;
        }
        System.out.printf("O resultado é %s", out);
    }

    private  static void ATV9() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o número:");

        int number = scan.nextInt();
        int smallNumber = number - 1;
        scan.close();
        boolean isPrime = true;
        while (smallNumber > 1  && isPrime) {
            isPrime = !((((double) number/smallNumber) % 1) == 0);
            smallNumber -= 1;
        }
        if (isPrime) {
            System.out.printf("É primo");
        } else {
            System.out.printf("Não é primo");
        }
    }

    private  static void ATV10() {
        for (int i = 1; i <= 100; i++) {
            boolean x3 = (((double)i/3) % 1) == 0;
            boolean x5 = (((double)i/5) % 1) == 0;
            boolean x3AndX5 = x3 && x5;

            if (x3AndX5) System.out.println("FizzBuzz");
            else if (x5) System.out.println("Buzz");
            else if (x3) System.out.println("Fizz");
            else System.out.println(i);
        }
    }


}
