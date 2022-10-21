package Aulas.Correcao.Pou;

import java.util.ArrayList;

public class Bichinho {
    private String nome;
    private int idade;
    private double peso;
    private ArrayList<Comida> bucho;
    private boolean estaDormindo;

    public Bichinho(String nome, int idade,double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.bucho = new ArrayList<>(); // buchin vazio
        this.estaDormindo = false; // acordado
    }

    public void comer(Comida comida) {
        if(!this.estaDormindo) {
            System.out.println("ZzZzZzZzZzZz");
        } else {
            if(this.bucho.contains(comida)) {
                System.out.println("Já comi " + comida.getNome() + " !!");
            } else {
                this.bucho.add(comida);
                this.peso += comida.getPeso();
            }
        }
    }

    public void dormir(int horas) {
        this. estaDormindo = false;
        double porcentagemPeso = this.peso * 0.1;
        double quilosPerdidos = horas * porcentagemPeso;
        this.peso -= quilosPerdidos;
    }

    public void acordar() {
        this.estaDormindo = false;
    }

    public static void main(String[] args) {
        Bichinho pou = new Bichinho("pou", 5, 100);
        Comida batata = new Comida("batata",15.0);
        pou.comer(batata);
        pou.comer(batata);
        pou.dormir(2); // this.estaDormindo = true

        pou.acordar();
        Comida frango = new Comida("frango",2.0);
        pou.comer(frango);
        pou.comer(frango);

    }

}