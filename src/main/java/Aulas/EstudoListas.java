package Aulas;

import java.util.ArrayList;

public class EstudoListas {
    public static void main(String[] args) {
        // Cria um novo ArrayList vazio que guarda Integer
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println(numeros);

        // Adicionando elementos no array
        numeros.add(10);
        numeros.add(20);
        numeros.add(1000);

        System.out.println(numeros);

        System.out.println(numeros.get(2)); // Numeros[2]
        // numeros[0] = 500
        numeros.set(0, 500);

        System.out.println(numeros);
        // remove o elemento na possição 2
        numeros.remove(2);
        System.out.println(numeros);

        numeros.add(1, 200); // adiciona o elemento na posição e move os demais

        System.out.println(numeros.size()); // array.lenght

        for(int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
        System.out.println("-------");
        for(int numero : numeros) { // Para cada valor dentro do array ele executa o código
              System.out.println(numero);
        }

        System.out.println(numeros.contains(500)); //true se encontrar False se não encontrar
        System.out.println(numeros.indexOf(200)); // qual a posição do 200 no array
        System.out.println(numeros.indexOf(11)); // -1 = não achou o elemento
        System.out.println(numeros.indexOf(200)); // mostra o array do primeiro encontrado
        System.out.println(numeros.lastIndexOf( 200)); // mostra o ultimo encontrado
    }
}
