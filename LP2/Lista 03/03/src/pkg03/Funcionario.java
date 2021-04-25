package pkg03;

public class Funcionario extends Pessoa{

    public Funcionario(int id, String nome, String email) {
        super(id, nome, email);
    }

    @Override
    public void Retorne(){
    
        System.out.println(this.nome);
    
    }
    
       
}
