package Atv2;

public class Programador extends Funcionario{
    private Double valhora;
    private Integer hora;
    private Double salario;

    public Programador(String nome, Double valhora, Integer hora) {
        super(nome);
        this.valhora = valhora;
        this.hora = hora;
    }

    @Override
    public Double calcularSalario() {
        this.salario = (valhora*hora);
        return salario;
    }
    @Override
    public void exibirDados(){
        System.out.println("nome:"+nome);
        System.out.println("Salario: "+calcularSalario());
    }

    public Double getValhora() {
        return valhora;
    }

    public Double getSalario() {
        return salario;
    }

}
