package Atv3;

public class Alimento extends  Produto implements Pagamento{
    public Alimento(String nome, Double valor) {
        super(nome, valor);
    }

    @Override
    public void processarPagamento() {

    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
    }
}

