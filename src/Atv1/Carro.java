package Atv1;

public class Carro implements Veiculo{
    private int velocidade;
    public Carro(){
        this.velocidade=0;
    }
    @Override
    public void acelerar(){
        velocidade+=10;
        System.out.println("velocidade atual do carro : "+velocidade);
    }

    @Override
    public void frear() {
        if(velocidade >=10){
            velocidade -=10;
            System.out.println("o carro esta freando, velocidade: "+velocidade);
        }else {
            velocidade=0;
            System.out.println("carro esta parado, velocidade: "+velocidade);
        }
    }

    public int getVelocidade() {
        return velocidade;
    }
}
