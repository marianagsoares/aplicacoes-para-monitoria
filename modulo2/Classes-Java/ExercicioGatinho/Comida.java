package ExercicioGatinho;

public class Comida  {

    //ATRIBUTOS
    private String nome;
   private double peso;

   //CONSTRUTOR
    Comida(String nomeDaComida, double pesoDaComida)
    {

        this.nome = nomeDaComida;
        this.peso = pesoDaComida;
    }

    //METODOS ESPECIAIS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


}
