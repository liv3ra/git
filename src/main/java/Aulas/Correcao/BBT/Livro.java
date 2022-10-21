package Aulas.Correcao.BBT;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Livro {
    private String nome;
    private Autor autor;
    private double preco;

    public Livro(String nome, Autor autor, double preco) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    public static void main(String[] args) {
        Autor jk = new Autor("JK","jk@gmail.com");
        Livro pedraFilosofal = new Livro("Harry Potter e a Pedra Filosofal", jk, 24.9);

        System.out.println(pedraFilosofal.autor.getEmail());

        Livro camaraSecreta = jk.escrevendoLivro("Harry Potter e a Camara Secreta",30.0);

        System.out.println(camaraSecreta.autor.getNome());

        ArrayList<Livro> LivrosJK = new ArrayList<>();
        LivrosJK.add(pedraFilosofal);
        LivrosJK.add(camaraSecreta);

        System.out.println(LivrosJK);

    }

}
