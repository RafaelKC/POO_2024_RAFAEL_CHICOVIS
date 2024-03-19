import java.util.ArrayList;

public class Turma {
    private String Nome;
    private ArrayList<Estudante> Estudantes;

    public Turma(String nome) {
        this.Nome = nome;
        this.Estudantes = new ArrayList<Estudante>();
    }

    public void InserirEstudante(Estudante estudante) {
        this.Estudantes.add(estudante);
    }

    public void AtribuitNota(String alunoNome, float nota) {
        boolean encontrado = false;
        int i = 0;
        while (!encontrado && i < this.Estudantes.size()) {
            Estudante estudanteAtual = this.Estudantes.get(i);
            if (estudanteAtual.Is(alunoNome)) {
                estudanteAtual.AtribuirNota(nota);
                encontrado = true;
            } else {
                i++;
            }
        }
    }
    public void Resultado() {
        System.out.println("Resultado da Turma" + this.Nome + ":");
        for (Estudante estudante: this.Estudantes) {
            System.out.println(estudante.Resultado());
        }
        System.out.println();
    }
}
