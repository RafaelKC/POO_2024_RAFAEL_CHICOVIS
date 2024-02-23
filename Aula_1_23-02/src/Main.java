import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATV3();
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

}
