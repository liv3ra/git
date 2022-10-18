package Aulas.poo;

//intutito: testar o usom da classe pessoa
public class PessoaTeste {
    public static void main(String[] args){
        // new => constroi um NOVO objeto de Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Victor"; //obj.atributo
        pessoa1.sobrenome = "oliveira";
        pessoa1.idade = 21;
        pessoa1.peso = 120.0;
        pessoa1.altura = 1.93;

        pessoa1.dizOla();

        Pessoa pessoa2 = new Pessoa ();
        System.out.println(pessoa2.nome);

        Pessoa pessoa3 = new Pessoa("Pedro", "Gomes", 35, 1.75, 30.5);

        Pessoa recemNascido = new Pessoa("Enzo", "Fittipaldi");

        System.out.println(recemNascido.sobrenome);
        recemNascido.idade++;// envelhecer
        recemNascido.dizOla();

        pessoa3.dizOla();
        pessoa3.mostrarIMC();
        double imcPessoa3 = pessoa3.calculaImc();
        System.out.println(imcPessoa3);

        pessoa3.comer("picanha");
        pessoa3.tomar("cervejinha");

        // Exemplo pessoas
          Pessoa Daniboy = new Pessoa("Daniboy", "Oliveira");

          Pessoa Ygin = new Pessoa("Ygin", "Gomes" );

          Daniboy.cumprimentar(Ygin);
    }
}
