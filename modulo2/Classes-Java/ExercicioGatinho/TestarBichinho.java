package ExercicioGatinho;

import java.sql.SQLOutput;

public class TestarBichinho {

    public static void main(String [] args){

        Bichinho bichinho1 = new Bichinho("Gato", 2, 3.2);
        Comida comida1 = new Comida ("Peixe", 1);
        Comida comida2 = new Comida ("Carne", 3);
        Comida comida3 = new Comida ("Peixe", 1);
        Comida comida4 = new Comida ("RAÇÃO", 3);


        System.out.println(bichinho1.getNome()); //GATO
        System.out.println(bichinho1.getPeso()); //3.2

        System.out.println("========O QUE ACONTECE AO DORMIR===========");
        System.out.println(bichinho1.getNome()); //GATO
        bichinho1.dormir(8);
        System.out.println(bichinho1.getPeso());

        System.out.println("=========O QUE ACONTECE QUANDO COME==========");
        bichinho1.acordar();
        bichinho1.comer(comida1); //PEIXE
        System.out.println(bichinho1.getPeso());

        bichinho1.comer(comida2); //CARNE
        System.out.println(bichinho1.getPeso());


        bichinho1.comer(comida4); //CARNE
        System.out.println(bichinho1.getPeso());


        bichinho1.comer(comida3); //CARNE
        System.out.println(bichinho1.getPeso());

        System.out.println("=========O QUE ELE COMEU ATE AGORA==========");

        for(String comidinha : bichinho1.getBucho()){
            System.out.println(comidinha);
        }
    }

}
