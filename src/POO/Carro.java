package POO;

public class Carro {

    //Todas as classes do Java já possuem um construtor
    //É possível criar vários construtores no Java, desde que sejam passados parâmetros distintos

//    Carro(String marca_, String modelo_, int numPassageiros_, int capCombustivel_, int consumoCombustivel_){
//        marca = marca_;
//        consumoCombustivel = consumoCombustivel_;
//        numPassageiros = numPassageiros_;
//        capCombustivel = capCombustivel_;
//        modelo = modelo_;
//    }
// Do this instead: this reference the attributes class
    //This: deixa explícito que o nome é atributo da classe

//    Carro(String marca, String modelo, int capCombustivel){
//        this.marca = marca;
//        this.consumoCombustivel = consumoCombustivel;
//        this.numPassageiros = numPassageiros;
//        this.capCombustivel = capCombustivel;
//        this.modelo = modelo;
//    }

    public Carro(){ };

    Carro(String marca, String modelo){
        this("Fiat",10, "Ducato");
        //1º chama o construtor de 2 parâmetros
        //2º executa o construtor de 3 parâmetros
    }

    Carro(String marca, int numPassageiros, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
    }

    private static String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double consumoCombustivel;

    //Encapsulamento: Não expor os atributos no teste usar métodos set e get
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getNumPassageiros(){
        return this.numPassageiros;
    }
    public void setNumPassageiros(int numPassageiros){
        this.numPassageiros = numPassageiros;
    }

    public double getconsumoCombustivel(){
        return this.consumoCombustivel;
    }
    public void setconsumoCombustivel(double consumoCombustivel){
        this.consumoCombustivel = consumoCombustivel;
    }

    public double getcapCombustivel(){
        return this.capCombustivel;
    }
    public void setcapCombustivel(double capCombustivel){
        this.capCombustivel = capCombustivel;
    }



    void exibirAutonomia (){ //Método sem retorno
        //Temos acesso a qualquer atributo declarado para a classe carro
        System.out.println("Exibir carro");
    }

    double obterAutonomia (){
        System.out.println("Método obter autonomia foi chamado");
        return capCombustivel * consumoCombustivel;
    }

    double calculaCombustivel (double km){ //Metodo com parâmetro: utilizar quando se precisa utilizar um atributo que nao faz parte da classe
        return km / consumoCombustivel;
    }

    private double divideKMPorConsumoCombustivel (double km){
        return this.capCombustivel * 40;
    }



}


// Declaração de carro

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