package Atv2;

public abstract class Funcionario {
    protected String nome;

    public abstract Double calcularSalario();
    public void exibirDados(){
        System.out.println("nome:"+nome);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
