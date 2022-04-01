package POO;

public class Aluno extends Pessoa{


    private String curso;
    private double[] notas;

    public void verificarAcesso(){
        this.nomeVisibilidade = "blablah";
        super.nomeVisibilidade = "blahblah";
    }


    public Aluno(){
        super(); //Chama o contrutor da super classe Pessoa
    }

    public Aluno(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone); //Super se usa quando se deseja acesso a classe pai (super classe)
        this.curso = curso; //This faz referencia a própria classe Aluno
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia (){
        return 0;
    }

    public boolean verificarAprovado(){
        return true;
    }

    public void metodoQualquer(){
        super.setCpf("14951936755");

    }
}
