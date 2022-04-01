package POO;

public class TesteContato {

    public static void main(String[] args){

        Contato contato = new Contato();

        contato.setNome("Tyrion");

        //Criar objeto telefone
        Telefone tel = new Telefone();
        tel.setDdd("21");
        tel.setNumero("96885-5737");
        tel.setTipo("celular");

        Telefone tel2 = new Telefone();
        tel2.setDdd("21");
        tel2.setNumero("98888-5737");
        tel2.setTipo("celular");

        Telefone[] telefones = new Telefone[2]; //Instanciando o objeto telefone
        telefones[0] = tel;
        telefones[1] = tel2;

        contato.setTelefones(telefones);


        if(contato != null & contato.getTelefones() != null){
            for(Telefone t : contato.getTelefones()){
                System.out.println("DDD + Número "+ t.getDdd() + " " +
                        t.getNumero());
            }
        }

        //Criar objeto endereco
        Endereco end = new Endereco();
        end.setCep("999999");
        end.setCidade("Rio");
        end.setComplemento("Planetario");
        end.setEstado("Rio de Janeiro");
        end.setNomeRua("Rua Marques");

        contato.setEndereco(end);

        System.out.println("Nome " + contato.getNome());

        if(contato.getEndereco() != null && contato != null){
            System.out.println("Endereco " + contato.getEndereco().getCidade());
        }
    }

}
