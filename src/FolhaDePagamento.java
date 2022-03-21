
public class FolhaDePagamento {
    public static void main(String[] args) throws Exception {
        System.out.println("-----Folha de Pagamento-----");
        Funcionario f1 = new Assalariado();
        f1.adicionarComissao(10);
        f1.setNome("Débora Cabrera");
        
        Funcionario f2 = new Horista();
        f2.setNome("Antonio");

        SetorPessoal sp = new SetorPessoal();
        sp.incluirFuncionario(f1);
        sp.incluirFuncionario(f2);

        sp.consultarFuncionario();



    }
}
