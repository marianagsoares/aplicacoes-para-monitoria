package ExercicioGatinho;

import java.util.ArrayList;

public class Bichinho {
    //ATRIBUTOS
    //nome, idade, peso, bucho

    private String nome;
    private int idade;
    private double peso;
    private ArrayList<String> bucho;
    private boolean dormindo;

    //CONSTRUTOR

    Bichinho (String nomeB, int idadeB, double pesoB){ //INSERIR NO CONSTRUTOR OS PARAMETROS NAO INICIALIZADOS
        this.nome = nomeB;
        this.idade = idadeB;
        this.peso = pesoB;
        this.bucho = new ArrayList<>();
        //this.bucho = new ArrayList<String>(bucho);
        this.dormindo = false;
    }

    //METODOS ESPECIAIS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ArrayList<String> getBucho() {
        return bucho;
    }

    public void setBucho(ArrayList<String> bucho) {
        this.bucho = bucho;
    }

    public boolean isDormindo() {
        return dormindo;
    }

    public void setDormindo(boolean dormindo) {
        this.dormindo = dormindo;
    }

    //METODOS DE TRABALHO

    //METODO DORMIR
    public void dormir(int horas){
        this.dormindo =true;

        //o quanto emagrce por hora
        double quantoEmagrece = this.peso * 0.01;
        //quantos g perdeu com base nas horas que dormiu

        double kgPerdidos = horas * quantoEmagrece;
        //pesoFinal depois de ter dormido

        this.peso = this.peso - kgPerdidos;
    }

    //METODO ACORDAR
    public void acordar(){
        this.dormindo = false;

    }

    //METODO COMER
    //comer é o método
    //Comida é o tipo do parametro
    //comidaDoGato é o parâmetro

    public void comer(Comida objetoComida){
        if(this.dormindo == true){
            System.out.println("ZZZZZZZZZZZZZZZZ"); //SE ESTIVER DORMINDO
        }
        else { //SE ESTIVER ACORDADO

           if(this.bucho.contains((objetoComida.getNome()))){

               System.out.println("EU JA COMI A COMIDA " + objetoComida.getNome());

           }
           else{
               this.bucho.add(objetoComida.getNome());
               this.peso += objetoComida.getPeso();
            }
        }
    }

}

