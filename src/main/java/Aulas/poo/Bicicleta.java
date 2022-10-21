package Aulas.poo;

public class Bicicleta {
    private int marcha;
    private int velocidade;

    public Bicicleta(int marcha, int velocidade) {
        this.marcha = marcha;
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "magrela (marcha= " + this.marcha  + ", " + "velocidade= " + this.velocidade + ")" ;
    }

    public static void main(String[] args) {
       Bicicleta bicicleta = new Bicicleta( 21,0);
       Bicicleta bicicleta2 = new Bicicleta( 15,100);
        System.out.println(bicicleta);
        System.out.println(bicicleta2);
    }
}
