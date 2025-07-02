package Atv3;

public class Eletronico extends Produto implements Pagamento{

    public Eletronico(String nome, Double valor) {
        super(nome, valor);
    }

    @Override
    public void processarPagamento() {
        double acrescimo = valor*0.10;
        this.valor+=acrescimo;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
    }
}
