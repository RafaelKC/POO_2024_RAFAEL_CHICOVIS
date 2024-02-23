import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATV10();
    }

    private  static void ATV1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey, what's ur name?");
        String userName = scan.nextLine();
        String out = String.format("Hello, %s", userName);
        System.out.println(out);
        scan.close();
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
