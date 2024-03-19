public class Pessoa {


    private String Nome;
    private  String Tipo;

    public Pessoa(String nome, String tipo){
        this.Nome = nome;
        this.Tipo = tipo;
    }

    public String buscarNome(){
        return this.Nome;
    }

    public String buscarTipo(){
        return this.Tipo;
    }
}
