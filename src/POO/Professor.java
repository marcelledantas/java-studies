package POO;

public class Professor extends Pessoa{


    private double salario;
    private String nomeCurso;

    public Professor(){
        super(); //Chama o contrutor da super classe Pessoa
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiquido(){
        return 0;
    }

}
