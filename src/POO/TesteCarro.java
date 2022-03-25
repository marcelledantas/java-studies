package POO;

public class TesteCarro {
    //Classe de teste carro


    public static void main(String[] args){
        //Carro carro = new Carro();
        //Métodos static não é necessário instanciar para se utilizar:
        // ex: public String getMarca() :: é necessário instanciar Carro car = new Carro()
        //Já declarando public static String getMarca() :: não é necessário instanciar :: apenas usar Carro.getMarca();

        Carro carro = new Carro();

        carro.getMarca();
        carro.setMarca("Fiat");

        carro.getNumPassageiros();
        carro.setNumPassageiros(10);

        carro.getconsumoCombustivel();
        carro.setconsumoCombustivel(100);

        carro.getcapCombustivel();
        carro.setcapCombustivel(4);;


        carro.exibirAutonomia(); //Método sem retorno
        System.out.println("Autonomia do carro " + carro.obterAutonomia()); // Método com retorno
        System.out.println("Quantidade de combustível " + carro.calculaCombustivel(2)); // Método com retorno e parâmetro

        System.out.println("Carro 1: marca " + carro.getMarca());
        auxiliarStatic(); //acesso na main porque ele é STATIC
    }

     static void auxiliarStatic (){
        System.out.println("Quero acessar esse método na main, portanto ele deve ser estático");
    }
}

