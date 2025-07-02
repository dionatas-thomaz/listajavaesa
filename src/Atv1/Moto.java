package Atv1;

public class Moto implements  Veiculo{
    private int velocidade;
    public Moto(){
        this.velocidade=0;
    }
    @Override
    public void acelerar(){
        velocidade+=10;
        System.out.println("velocidade atual da moto: "+velocidade);
    }

    @Override
    public void frear() {
        if(velocidade >=10){
            velocidade -=10;
            System.out.println("a moto esta freando, velocidade: "+velocidade);
        }else {
            velocidade=0;
            System.out.println("a moto esta parado, velocidade: "+velocidade);
        }
    }

}
