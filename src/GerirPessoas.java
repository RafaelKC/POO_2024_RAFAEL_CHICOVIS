import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class GerirPessoas {
    public static void CadastrarPessoa(Scanner ler, ArrayList<Pessoa> pessoas){
        System.out.print("Qual o nome da pessoa?");
        String nome = ler.next();
        String tipo = null;
        System.out.println("Qual a função (tipo) da pessoa? \n1-cliente \n2-funcionário \n3-gerente");
        int tipoResposta = ler.nextInt();
        if (tipoResposta == 1){
            tipo = "cliente";
        } else if (tipoResposta == 2){
            tipo = "funcionário";
        } else if(tipoResposta == 3){
            tipo = "gerente";
        } else {
            System.out.println("Opção inválida.");
            return;
        }
        System.out.println("Deseja salvar " + nome + " Tipo: " + tipo +"? Sim/Não");
        String resposta = ler.next();
        if (Objects.equals(resposta, "Sim")){
            Pessoa pessoa = new Pessoa(nome, tipo);
            pessoas.add(pessoa);
        }
        else{
            System.out.println("Ação encerrada. Nenhuma pessoa foi cadastrada.");
        }
    }

    public static void BuscarPessoaPorTipo(Scanner ler, ArrayList<Pessoa> pessoas) {
        System.out.print("Qual tipo quer buscar? ");
        String tipoBusca = ler.next();
        boolean encontrou = false;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.buscarTipo().equalsIgnoreCase(tipoBusca)) {
                System.out.println("Nome: " + pessoa.buscarNome() + " --- Tipo: " + pessoa.buscarTipo());
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Não há pessoas com esse tipo/função.");
        }
    }

}
