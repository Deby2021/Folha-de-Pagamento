public class Funcionario {

    private String nome;
    

    public void adicionarComissao(Integer qtdVenda) {
        Double comissao = qtdVenda * 1.2;
        System.out.println("Valor da comissão: " + comissao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void add(Funcionario funcionario) {
    }

}
