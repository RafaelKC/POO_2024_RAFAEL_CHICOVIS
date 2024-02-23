import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATV1();
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
}