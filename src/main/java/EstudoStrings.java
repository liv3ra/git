import java.util.Arrays;
import java.util.Scanner;

public class EstudoStrings {
  public static void main(String[] args) {
      // strings são cadeias de caracteres
      // "VICTOR" -> V = 0, I = 1, C = 2, T = 4, O = 5, R = 6
      String nome = "Cleito";

      if(nome == "Cleito") {
          System.out.println("São iguais");
      }

      System.out.println("Digite seu sobrenome: ");
      Scanner entrada = new Scanner(System.in);
      String sobrenome = entrada.nextLine();

      if(sobrenome.equals("Oliveira")) { // aqui compara o conteudo das strings
          System.out.println("São iguais");
      } else {
          System.out.println("São diferentes");
      }

       // sobrenome.equalsIgnoreCase("Oliveira"); // ignora maiusculo e minusculo

      // Outros metodos
      String java = "Java";
      String ja = java.substring(0, 2); // começa do zero e vai ate 2 (não incluso)
      String va = java.substring( 2); // corta do 2 até p final da string

      System.out.println(ja);
      System.out.println(va);

      String m1 = "Hello, ";
      String m2 = "World!";
      String m3 = m1.concat(m2); // m1 + m2
      System.out.println(m3);

      System.out.println(java.length()); // quantos caracteres ela possui
      System.out.println(java.isEmpty()); // verifica se esta cazia => **
      System.out.println(java.toUpperCase()); // JAVA em caixa alta
      System.out.println(java.toLowerCase()); // java em caixa baixa
      // Exemplo
      System.out.println("digite um nome: ");
      String seuNome = entrada.nextLine();

      if (seuNome.toUpperCase().equals("VICTOR")) {
          System.out.println("SEU NOME E VICTOR");
      }

      String data = "13/10/2022";
      String[] valores = data.split( "/"); // ["13", "10", "2022"]
      System.out.println(valores[0]);

      String email = "danvictor881@gmail.com";
      String[] valoresEmail = email.split( "@"); // ["danvictor881", "gmail.com"]
      System.out.println(valoresEmail[0]);

      String teste = "a,amha e sexta-feira!";
      String[] teste2 = teste.split( "");
      System.out.println(Arrays.toString(teste2));


  }
}
