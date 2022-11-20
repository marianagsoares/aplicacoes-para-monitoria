package ExercicioClasse;

public class PessoaFisica extends Pessoa{

    private String CPF;
    private String RG;


    PessoaFisica(String nome, String numero, int idade, String endereco, String CPF, String RG){
        super(nome, numero, idade, endereco);
        this.CPF = CPF;
        this.RG = RG;
    }


    public String getCPF(){
        return this.CPF;
    }

    public  String getRG(){
        return this.RG;
    }

    @Override
    public void mostrarDados(){
        System.out.println(("Nome: " + this.getNome()));
        System.out.println("idade: " + this.getIdade() + " anos");
        System.out.println("Endereco: " + this.getEndereco());
        System.out.println("numero: " + this.getNumero());
        System.out.println("RG: " + this.getRG());
        System.out.println("CPF: " + this.getCPF());
    }

}
