import java.util.ArrayList;
import java.util.List;

public class SetorPessoal {

    public List<Funcionario> funcionario;

    public SetorPessoal(){
        funcionario = new ArrayList<Funcionario>();
    }
    
    public void incluirFuncionario(Funcionario funcionario) {
        funcionario.add(funcionario);
    }

    public void excluirFuncionario() {
        
    }

    public void consultarFuncionario() {

       for (Funcionario funcionario : funcionario) {
           System.out.println("Funcionário "+ funcionario.getNome());
       }
        
    }

    public void calcularFolha() {
        
    }
}
