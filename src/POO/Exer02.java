package POO;

public class Exer02 {
    public static void main (String[] args){
        Livro livro = new Livro();

        livro.autor = "Master";
        livro.nome = "Java";
        livro.qtdPaginas = 100;

        System.out.println("Nome do livro " + livro.nome);
    }
}
