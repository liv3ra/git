package Aulas.Correcao;

import java.util.Scanner;

public class Correcao4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual sua idade?? ");
        int idade = entrada.nextInt();

        if (idade < 18) {
            System.out.println(" Voce e menor é idade");
        } else {
            System.out.println(" Voce e maior de idade");
        }
    }
}
