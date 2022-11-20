package ExercicioClasse;

public class Pessoa {
   private String nome;
   private String numero;

   private int idade;
    private String endereco;

    Pessoa (String atNome, String atNumero, int atIdade, String atEndereco){
        this.nome = atNome;
        this.numero = atNumero;
        this.idade = atIdade;
        this.endereco = atEndereco;
    }

    public String getNome(){
        return this.nome;
    }

    public String getNumero(){
        return this.numero;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public int getIdade(){
        return this.idade;
    }



    public void mostrarDados(){

        System.out.println("Nome: " + this.nome);
        System.out.println("Número: " + this.numero);
        System.out.println("Endereço: " + this.endereco);

    }

    public void receberAumento(){
        if(this.idade > 40){
            System.out.println("VOCE RECEBERÁ UM AUMENTO");
        }
        else{
            System.out.println("VOCÊ NÃO RECEBERÁ UM AUMENTO");
        }
    }
}
