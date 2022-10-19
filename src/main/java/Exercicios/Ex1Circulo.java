package Exercicios;
//1) Crie uma classe Circulo que possui:
//	* Atributos: raio, cor.
//	* Construtores:
//		- Cria circulos com base no parâmetro raio do construtor;
//		- Cria círculos de raio 1;
//	* Métodos:
//		- calcularArea() => deve retornar double (PI * RAIO * RAIO)
//		- calcularCircunferencia => deve retornar double (2 * PI * RAIO)
//		- mudarRaio(double novoRaio) => deve alterar o valor do raio

public class Ex1Circulo {
    double raio;
    String cor;
    double pi;

    Ex1Circulo(double raio, String cor, double pi) {
        this.raio = raio;
        this.cor = cor;
        this.pi = pi;
    }

    public double calculaArea() {
        double area = this.pi * (this.raio * this.raio);
        return area;

    }

}
