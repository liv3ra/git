package Aulas.poo;
// super classe
public class Pet {
    //private so voce tem o acesso
    //protected sua familia tem acesso
    private String nome;
    private int idade;

    protected double peso;
    //protected permite acesso direto nas subclasses
    //nas subclasses o atributo/metodo private
    //não é acessivel
    public Pet(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }



    public void fazerSom() {
        System.out.println("...");
    }

    public void comer(String comida) {
        System.out.println("Estou comendo " + comida);
    }

    public void dormir() {
        System.out.println("ZzZzZzZzZzZz");
    }

    public void brincar() {
        System.out.println("Estou brincando...");
    }
    // pet.peso;
    // double peso = pet.getPeso()
    public double getPeso() { // apenas leitura do peso
        return this.peso;
    }
    // pet.peso = 231231;
    // pet.setPeso(232);
    public void setPeso(double novoPeso) { //possibilidade de alterar o peso
        this.peso = novoPeso;
    }
}
