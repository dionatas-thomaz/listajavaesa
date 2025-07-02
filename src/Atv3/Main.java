package Atv3;

public class Main {
    public static void main(String[] args) {
    Eletronico lamp = new Eletronico("lâmpada",12.50);
    lamp.processarPagamento();
    lamp.exibirDetalhes();
    Alimento pao = new Alimento("pão",2.00);
    lamp.exibirDetalhes();
    }
}
