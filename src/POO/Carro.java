package POO;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia (){

        //Temos acesso a qualquer atributo declarado para a classe carro
        System.out.println("Exibir carro");
    }


} // Declaração de carro

//Dar função ao carro: tem-se um objeto
//Se quisermos criar uma van:

// Instancia através da palavra new:
//Carro van = new Carro();
//van.marca = "Fiat";
//van.modelo = "Ducato";
//van.numPassageiros = 10;
//van.capCombustivel = 100;
//van.consumoCombustivel = 0.2;
//
//Não é assim que se costuma setar valores de um objeto em projeto real