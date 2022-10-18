package Aulas.poo;

import javax.script.SimpleScriptContext;
import java.util.ArrayList;

public class Pessoa { // abstrair => simplificar
    // Propriedades/Atributos de uma pessoa
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;

    ArrayList<Pessoa> conhecidos = new ArrayList<>();

    Pessoa() {  //construtor da classe
        //this => representa o objeto
        this.nome = "Victor";
        this.sobrenome = "Oliveira";
        this.idade = 21;
        this.peso = 120.0;
        this.altura = 1.93;
    }

    Pessoa(String nome, String sobrenome, int idade, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = 0;
        this.altura = 0.5;
        this.peso = 3.5;
    }

    //Ações de uma pessoa (metodods)
    // <tipo_retorno> nomeDoMetodo(PARAMETROS) {}
    void dizOla() { // método que não retorna nada
        System.out.println("Olá, tudo bem?, meu nome é " + this.nome);
    }

    void mostrarIMC() {
        // double imc = this.peso / (this.altura * this.altura);
        double imc = this.calculaImc();
        System.out.println("o meu IMC é " + imc);
    }

    double calculaImc() { // DEVE retornar um valor
        double imc = this.peso / (this.altura * this.altura);
        return imc;
    }

    void comer(String comida) {
        System.out.println("Estou Comendo " + comida);
    }

    void tomar(String comida) {
        System.out.println("e tomando uma " + comida + " gelada!");
    }

    void cumprimentar(Pessoa pessoa) {
        this.dizOla();
        pessoa.dizOla();

        if(!this.conhecePessoa(pessoa));
        this.addPessoaNova(pessoa);
        pessoa.addPessoaNova(this); // this é o objeto que chama cumprimentar()
    }

    void addPessoaNova(Pessoa pessoa) {  // faz o objeto "conhecer"
        System.out.println(this.nome + " conheceu " + pessoa.nome + " !! ");
        this.conhecidos.add(pessoa);
    }

    boolean conhecePessoa(Pessoa pessoa) {
        // se true, a pessoa (this) conhece a outra pessoa
        // se false, não conhece
        return this.conhecidos.contains(pessoa);
       }
     }


