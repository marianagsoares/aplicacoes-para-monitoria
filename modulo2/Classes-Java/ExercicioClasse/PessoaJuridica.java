package ExercicioClasse;

public class PessoaJuridica extends Pessoa{

    private String CNPJ;
    private String InscEstadual;

    PessoaJuridica(String nome, String numero, int idade, String endereco, String CNPJ, String inscEstadual){

        super(nome, numero, idade, endereco);
        this.CNPJ = CNPJ;
        this.InscEstadual = inscEstadual;
    }

    public String getCNPJ(){
        return this.CNPJ;
    }
    public String getInscEstadual(){
        return this.InscEstadual;
    }

    @Override

    public void mostrarDados(){
        System.out.println(("Nome: " + this.getNome()));
        System.out.println("idade: " + this.getIdade() + " anos");
        System.out.println("Endereco: " + this.getEndereco());
        System.out.println("numero: " + this.getNumero());
        System.out.println("CNPJ: " + this.CNPJ);
        System.out.println("Inscrição Estadual: " + this.InscEstadual);
    }

}
