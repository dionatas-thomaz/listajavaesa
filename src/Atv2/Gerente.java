package Atv2;

public class Gerente extends Funcionario {
    private Double salario;

    public Gerente(Double salario) {
        this.salario = salario;
    }
    @Override
    public void calcularSalario(){

    }
    @Override
    public void exibirDados(){
        System.out.println("nome:"+nome);
        System.out.println("Salario: "+salario);
    }
}
