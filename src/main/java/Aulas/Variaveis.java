package Aulas;

public class Variaveis {
    // Execução do nosso programa JAVA
    public static void main(String[] args) {
        System.out.println("Hello, World!"); // Equivale ao console.log

        // Variáveis no JAVA
        // fortimente tipado e estaticamente tipado
        int idade = 20; // inteiro (2 B)
        double salario = 4500.99; // dupla precisão
        float nota = 7.5f; // sufixo para float
        long populacaoTerra = 7_900_000_000l;
        int i = 1, j = 0, k = 1000; // multiplas variaveis
        String nomeCompleto = "Daniel Victor"; // sempre aspas duplas

        int teste = 10;
        teste = 9; // retribuição de variáveis

        final int test2 = 200; // impossivel mudar o valor
        // teste2 = 1000;

        // Operadores
        int a = 10;
        int b = 5;

        int soma = a + b; // 15
        int subtracao = a - b; // 5
        int multiplicacao = a * b; // 50
        int divisao = a / b; // 2

        System.out.println("O resultado da soma é " + soma);  // o resultado da soma e 15
        // DIVISÃO ENTRE DOIS INTEIROS RESULT EM INTEIRO
        int sete = 7;
        int dois = 2;
        double dois2 = 2.0;
        System.out.println(sete / dois); // 3
        double resultado2 = sete / dois2;
        System.out.println(resultado2); // 3.5

        // Math
        double x = Math.sqrt(144); // 12
        double y = Math.pow(5, 2); // 25
        System.out.println(Math.PI);
        // Casting != converter variavel
        int pi2 = (int) Math.PI;
        System.out.println(pi2);

        double resultado3 = sete / (double) dois; // 7 / 2.0

        //Operadores 2
        int valor = 5;
        valor++; // incremento +1
        valor--; // decremento -1
        valor += 10;

        // operadores relacionais
        boolean teste1 = 5 > 1; //true
        boolean teste2 = 5 < 1; // false
        boolean teste3 = 5 == 5; //true
        boolean teste4 = 5 != 1; //true
        boolean teste5 = 6 >= 6; //true
        boolean teste6 = 5 <= 9; //true

        // Operadores lógicos
        boolean teste7 = true && false; // false
        boolean teste8 = true || false; // true
        boolean teste9 = (5 > 10) && (10 < 5); //false
        boolean teste10 = (10 >= 0) || (1 < 5); //true
        boolean teste11 = (5 > 1); // true
        boolean teste12 = !teste11; //false


    }
}
