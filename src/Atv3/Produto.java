package Atv3;

public abstract class Produto {
    protected String nome;
    protected Double valor;

    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public void exibirDetalhes(){
        System.out.println("nome: "+nome);
        System.out.println("valor: "+valor);
    }
}
