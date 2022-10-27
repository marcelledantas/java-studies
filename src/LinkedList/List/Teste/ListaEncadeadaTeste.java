package LinkedList.List.Teste;

import LinkedList.List.ListaEncadeada;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada<Integer>();

        lista.adiciona(1);

        System.out.println("Tamanho " + lista.getTamanho());
        System.out.println(lista);

        lista.adiciona(2);
        System.out.println(lista);

        lista.adiciona(3);
        System.out.println(lista);

        lista.adiciona(4);
        System.out.println(lista);

    }
}
