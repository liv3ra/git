package Aulas.poo;

// sub-classe/classe filha
public class Gato extends Pet{
    private String comidaFavorita;
    private String raca;

    public Gato(String nome, int idade, double peso, String comidaFavorita, String raca) {
        // representa a Classe Pet
        super(nome, idade, peso); // chamando o construtor da classe pai/superclasse
        this.comidaFavorita = comidaFavorita;
        this.raca = raca;

    }

    @Override
    public void fazerSom() { // vamos sobrescrever a ação de fazer som
        System.out.println("MIAU MIAU");
    }

    @Override
    public void brincar() {
        this.fazerSom();
        System.out.println("MIAU MIAU CADE MEU HUMANO QUERO BRINCAR COM ELE");
        System.out.println("MIAU MIAU ESTOU CANSADO VOU DORMIR HUMANO");
        this.dormir();

    }

    @Override
    public void comer(String comida) {
        // verifica se e a comida favorita
        if(comida.equals(this.comidaFavorita)) { // verifica se é a comida favorita
            super.comer(comida);
            this.peso += 0.2;
            // this.setPeso(getPeso() + 0.2);
        } else {
            System.out.println("MIAU MIAU CADE O FONE HUMANO, EU QUERO O FONE ORIGINAL");

        }
    }

    public void arranharSofa() {
        this.fazerSom();
        System.out.println("MIAU MIAU ÓLA HUMANO ESSE SOFA E SEU EU VOU ARANHAR ELE UM POUCO ESTA BEM?");
        System.out.println("aranhando o sofa");
    }

    public static void main(String[] args) {
        Pet pet1 = new Pet("megumin", 1, 3.0);
        pet1.dormir();
        pet1.comer("peixe");

        Gato Mimi = new Gato("mimi",12,4, "fone de ouvido original", "Frajola");
        Mimi.dormir();
        Mimi.fazerSom();
        Mimi.comer("fone de ouvido original");
        Mimi.setPeso(4);
        Mimi.brincar();
        Mimi.arranharSofa();
    }
}

