package Aulas;

import java.util.Scanner;

public class EstudoArrays {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(numeros.length); // tamanho do array
        System.out.println(numeros[3]);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("A possição " + i + " com valor de " + numeros[i]);
        }

        int[] numeros2 = new int[50]; // 0..49
        numeros2[0] = 500;
        numeros2[1] = -200;
        //...
        numeros2[49] = 1;

        double[] notas = new double[5];
        String[] nomes = {"Danielo", "Daniel", "noani"};
        String[] sobrenomes = new String[10];

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int quantidade = entrada.nextInt();
        boolean[] valores = new boolean[quantidade];

        // Exemplo
        System.out.println("Digite o total de notas:");
        int totalNotas = entrada.nextInt(); // 5

        double[] notasProvas = new double[totalNotas]; // 0..4

        for (int i = 0; i < totalNotas; i++) {
            System.out.println("Digite o valor da Nota: ");
            notasProvas[i] = entrada.nextDouble();
        }

        double soma = 0.0;
        for (double nota : notasProvas) { // para cada valor dentro dae notasProva
            System.out.println(nota);
            soma += nota;

        }

        double media = soma / notasProvas.length;

        // Condição ternária
        String mensagem = (media < 7) ? "voce esta reprovado" : "voce esta aprovado";
        System.out.println(mensagem);

        // Default values
        int numero; // padrão = 0
        double nota2; // padrão = 0.0
        long populacao; // padrão = 0
        boolean teste; // padrão = false
        String nome; // null => ausência de objeto na variável

        // Wrapper classes
        Integer numero2 = 1;
        Double nota3 = 1.0;
        Long pop2 = 1L;
        Boolean teste2 = false;
    }
}