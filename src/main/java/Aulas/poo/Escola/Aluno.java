package Aulas.poo.Escola;

public class Aluno extends Pessoa {
    private double media;
    //chamada super deve vir em primeiro
    public Aluno(String nome, String email, String cpf, double media){
        super(nome, email, cpf); // estou chamando um construtor de pessoa
        this.media = media;
    }

    @Override
    public void seApresentar() { // na sobescrita mudamos o comportamento (apenas)
        super.seApresentar(); // super = Pessoa
        System.out.println("Eu sou um aluno com media = " + this.media);
    }

    public double getMedia() {
        return this.media;
    }


}
