package Atv2;

public class Gerente extends Funcionario {
    private Double salario;

    public Gerente(String nome, Double salario) {
        super(nome);
        this.salario = salario;
    }

    @Override
    public  Double calcularSalario(){return 0.0;}
    @Override
    public void exibirDados(){
        System.out.println("nome:"+nome);
        System.out.println("Salario: "+salario);
    }
}
