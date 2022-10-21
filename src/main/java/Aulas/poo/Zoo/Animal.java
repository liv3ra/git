package Aulas.poo.Zoo;
// Na interface voce define um conjunto de metodos
// E a classe que "herda" deve implementar estes metodos
public interface Animal {
    void dormir();
    void fazerSom();
    void comer(String comida);
}

class Gato implements Animal {
   @Override
   public void dormir() {
       System.out.println("ZzZzZzZz");
   }
   public void fazerSom() {
       System.out.println("MIAU MIAU");
   }
   public void comer(String comida) {
       if(comida.equals("peixe")) {
           System.out.println("HMMMMMMM PEIXIN BOMM");
       } else {
           System.out.println("isso n ta ruim mas prefiro um peixin");
       }
   }
}

class Galinha implements Animal {
    @Override
    public void dormir() {
        System.out.println("ZzZzZz Coo... Coco.. ZzZzZz");
    }

    @Override
    public void fazerSom() {
        System.out.println("Coo Coo co ");
    }

    @Override
    public void comer(String comida) {
        System.out.println("Coo Coo Co MT BOM ");
    }

    public static void main(String[] args) {
        Galinha galinha = new Galinha();
        Gato gato = new Gato();

        galinha.fazerSom();
        galinha.comer("frango");
        galinha.dormir();

        gato.fazerSom();
        gato.comer("peixe");
        gato.dormir();

        // interface não consigo criar um objeto
        // Animal novoAnimal = new Animal(); // não consigo criar pois é interface

        Animal animalGalinha = new Galinha();
        Animal animalGatinho = new Gato();
        System.out.println("==== Polimorfismo  ===");
        animalGalinha.fazerSom();
        animalGatinho.fazerSom();


    }

}


