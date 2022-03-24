package POO;

public class Exer01 {
    public static void main(String[] arg){
        Lampada lampada = new Lampada();

        lampada.cor = "Amarela";
        lampada.modelo = "Amarela";
        lampada.garantiaMeses = 6;
        lampada.potencia = 60;
        lampada.tensao = "Bivolt";
        lampada.tipoLuz = "Led";

        lampada.tipos = new String[5]; //Instanciar o array - alocar na memória, já que o array também é um objeto
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Cabeceira";
    }
}
