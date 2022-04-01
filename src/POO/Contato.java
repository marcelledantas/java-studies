package POO;

public class Contato {

    private String nome;
    private Endereco endereco;
    //Tipo de relacionamento 1 para * (muitos)
    //No dia a dia de projeto não são declarados Arrays, mas sim collections (Lista or setting) por exemplo, que são estruturas de dados
    //prontas, dependendo do design da aplicação
    private Telefone[] telefones;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }
}
