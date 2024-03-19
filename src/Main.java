import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        int opcao;
        do
        {
            System.out.println("================================");
            System.out.println("1-Cadastrar pessoa \n2-Listar pessoas \n3-Buscar pessoas por tipo");
            System.out.print("Escolha uma opção do menu: ");
            opcao = ler.nextInt();
            if (opcao == 1){
               GerirPessoas.CadastrarPessoa(ler, pessoas);
            }
            else if(opcao == 2){
                for (Pessoa pessoaObj: pessoas){
                    System.out.println("Nome: " + pessoaObj.buscarNome() + " --- Tipo: " + pessoaObj.buscarTipo());
                }
            }
            else if(opcao == 3){
               GerirPessoas.BuscarPessoaPorTipo(ler, pessoas);

            }
        }while(opcao != 4);

    }
}

