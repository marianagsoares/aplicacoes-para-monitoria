package ExercicioClasse;
import java.util.ArrayList;

public class PessoaTeste {

    public static void main(String[] args){

        //POLIMORFISMO
        Pessoa pessoaFisica1 = new PessoaFisica("Gabiriela","8885585", 55,"Rua Fernandes Braga", "9556-444", "85584");
        Pessoa pessoaFisica2 = new PessoaFisica("joana","552698525", 50,"Rua Lima Ferreira", "9556-444", "68526545");
        Pessoa pessoaJuridica1 = new PessoaJuridica("Kelly", "98569855", 20, "Rua dos afogados", "9855", "85");

        //APENAS INICIALIZEI A CLASSE PESSOA
        Pessoa pessoa1 = new Pessoa ("Henrique", "Rua Capixaba", 80, "Rua da felicidade");


        ArrayList<Pessoa> clientes = new ArrayList<>();
        clientes.add(pessoaFisica1);
        clientes.add(pessoaFisica2);
        clientes.add(pessoaJuridica1);
        clientes.add(pessoa1);



        //Pessoa superclasse
        //cliente é quem percorre o array
        //clientes é o array
        for (Pessoa cliente : clientes){
            cliente.mostrarDados();
            System.out.println("=========================================================");
        }
    }
}