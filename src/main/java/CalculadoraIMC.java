
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.println("qual seu nome?");
       String nome = entrada.nextLine();


       System.out.println("qual sua idade?");
       int idade = entrada.nextInt();

       System.out.println("qual sua altura (m)? ");
       double altura = entrada.nextDouble();

       System.out.println("qual o seu peso (kg)?");
       double peso = entrada.nextDouble();

       //
       double imc = peso / (altura * altura);

       System.out.println(" Olá, meu nome é " + nome + " e tenho " + idade + " anos!");
       System.out.println("Este e o seu " + imc);
       System.out.printf("este é p seu IMC = %.2f\n", imc);
       System.out.printf(" Olá, meu nome é %s e tenho %d anos!\n", nome, idade);

       if (imc < 17) {
          System.out.println("muito abaixo do peso");
       } else if (imc >= 17 && imc <= 18.49) {
          System.out.println("abaixo do peso");
       } else if (imc >= 18.5 && imc <= 24.99) {
          System.out.println("peso normal");
       } else if (imc == 25 && imc <= 29.99) {
          System.out.println("acima do peso");
       } else if (imc >= 30 && imc <= 34.99) {
          System.out.println("obesidade I");
       } else if (imc >= 35 && imc <= 39.99) {
          System.out.println("obesidade II (severa)");
       } else {
          System.out.println("obesidade III (mórbida)");
       }

       // Switch-case
       System.out.println("Selecione uma dietta (1 a 3)");
       System.out.println("1 - Agua");
       System.out.println("2 - Fruta");
       System.out.println("3 - Batata");
       int dieta = entrada.nextInt();

       switch(dieta) {
          case 1:
             System.out.println("Você escolheu a dieta da água!");
             break; // impedir de testar as condições abaixo
          case 2:
             System.out.println("Você escolheu a dieta da fruta!");
             break;
          case 3:
             System.out.println("Você escolheu a dieta da batata!");
          default: // "else"
             System.out.println("Esta dieta não existe!");
       }

       System.out.println("Você tem quantos alimentos favoritos?");
       int totalAlimentos = entrada.nextInt();

       for (int i = 0; i <= totalAlimentos; i++) {
          String alimento = entrada.next();
          System.out.println(i);
       }
       int i = 0;
       while (i < totalAlimentos){
          System.out.println(i);
          i++;
       }
    }
}
