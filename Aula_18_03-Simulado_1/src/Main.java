public class Main {
    public static void main(String[] args) {
         Turma turmaA = new Turma("A");
        turmaA.InserirEstudante(new Estudante("Gabriel"));
        turmaA.InserirEstudante(new Estudante("Aline"));
        turmaA.InserirEstudante(new Estudante("Ricardo"));
        turmaA.InserirEstudante(new Estudante("Rafaela"));

        Turma turmaB = new Turma("B");
        turmaB.InserirEstudante(new Estudante("Lucas"));
        turmaB.InserirEstudante(new Estudante("Alexandre"));
        turmaB.InserirEstudante(new Estudante("Giovana"));
        turmaB.InserirEstudante(new Estudante("Giulia"));

        turmaA.AtribuitNota("Ricardo", 8.0f);
        turmaA.AtribuitNota("Aline", 9.0f);
        turmaA.AtribuitNota("Rafaela", 5.5f);
        turmaA.AtribuitNota("Gabriel", 6.0f);

        turmaB.AtribuitNota("Lucas", 10.0f);
        turmaB.AtribuitNota("Alexandre", 3.0f);
        turmaB.AtribuitNota("Giovana", 7.0f);
        turmaB.AtribuitNota("Giulia", 8.5f);

        turmaA.Resultado();
        turmaB.Resultado();
    }
}

