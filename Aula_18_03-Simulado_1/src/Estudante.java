import java.util.Objects;

public class Estudante {
    private String Nome;
    private float Nota;

    public Estudante(String nome) {
        this.Nome = nome;
        this.Nota = 0;
    }

    public boolean Is(String nome) {
        return Objects.equals(this.Nome, nome);
    }

    public void AtribuirNota(float nota) {
        this.Nota = nota;
    }

    public String Resultado() {
        String resultadoMgs = "%s (%s): %s";

        String resultado = "APROVADO";

        if (this.Nota < 7 && this.Nota >= 4) {
            resultado = "RECUPERAÇÃO";
        } else if (this.Nota < 4) {
            resultado = "REPROVADO";
        }

        return String.format(resultadoMgs, this.Nome, this.Nota, resultado);
    }
}
