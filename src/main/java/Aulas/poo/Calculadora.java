package Aulas.poo;

public class Calculadora {

    public static double PI = 3.14;

    // Metodo estatico
    // Não pertence ao objeto, mas sim a classe

    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static  double multiplicacao(double a, double b) {
        return a * b;
    }

    public static  double divisao(double a, double b) {
        return a / b;
    }
    // git add -A
    // main = auto-executavel
    public static void main(String[] args) {
        double resultadoSoma = Calculadora.soma(14,2); // Resultado soma
        double resultadoSub = Calculadora.subtracao(12 ,2);
        double resultadoMult = Calculadora.multiplicacao(10,2);
        double resultadoDiv = Calculadora.divisao(8,2);
    System.out.println();
    }
}
