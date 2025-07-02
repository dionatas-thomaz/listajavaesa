package Atv1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro fusca= new Carro();
        Moto  xre = new Moto();

        fusca.acelerar();
        xre.acelerar();
        fusca.acelerar();
        xre.frear();
        fusca.frear();
    }
}