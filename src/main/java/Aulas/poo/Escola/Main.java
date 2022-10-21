package Aulas.poo.Escola;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno( "Victor", "flavinhodopneu@gmail.com", "40028022", 7.0);
        aluno.seApresentar();

        Professor prof = new Professor("Marcelo", "marcelo@hotmail.com", "32165488", "geografia");
        prof.seApresentar();

        Pessoa p1 = new Pessoa("Charles", "lec@gmail.com", "32156458");
        p1.seApresentar();
        // Aluno é uma Pessoa
        Pessoa p2 = new Aluno("Victor", "flavinhodopneu@gmail.com", "40028022", 7.0);
        // Professor é uma Pessoa
        Pessoa p3 = new Professor("Marcelo", "marcelo@hotmail.com", "32165488", "geografia");
        System.out.println("==========");
        p2.seApresentar();
        p3.seApresentar();

        // Polimorfismo
        System.out.println("==PESSOAS==");
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(aluno);
        pessoas.add(prof);
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        for(Pessoa pessoa : pessoas) {
            // o método se apresentar se comporta diferente dependendo da classe
            // original
            pessoa.seApresentar();
        }
          }
    }
