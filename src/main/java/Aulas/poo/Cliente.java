package Aulas.poo;

import java.time.LocalDate;

public class Cliente {
   private int id;
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private double altura;
    private double peso;

    Cliente(int id, String nome, String sobrenome, LocalDate dataNascimento,
            double altura, double peso) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
    }
        public void crescer() {
            this.altura += 0.2;
        }

        // Getter=> possibilitam a leitura dos atributos
    String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return  this.sobrenome;
    }

    public String getNomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }

    // Setter => serve para alterar o valor
    // COMO o valor é alterado
    // Validar o novo valor e ver se "faz sentido"

    public void serAltura(double altura) {
        if (altura < 2.51) {
            this.altura = altura;
        } else {
            System.out.println("altura invalida, atributo não modificado.");
        }
    }
    public void setPeso(double novoPeso) {
        this.peso = novoPeso;
    }

}


