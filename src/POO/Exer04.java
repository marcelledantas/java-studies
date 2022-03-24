package POO;

import java.util.Date;

public class Exer04 {
//Classe de teste
    public static void main (String[] args){
        LivroDeBiclioteca livro = new LivroDeBiclioteca();
        livro.autor = "Master";
        livro.nome = "Java";
        livro.qtdPaginas = 100;
        livro.emprestado = true;

        livro.dataEntrega = new Date();

        System.out.println("Nome do livro " + livro.nome);
    }

}
