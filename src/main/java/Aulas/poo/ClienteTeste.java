package Aulas.poo;

import java.time.LocalDate;

// Encapsulamento =>
// Escolhe quais atributos/métodos serão visiveis foda da classe
// Public (padrão) => visivel para todos
// Private => os métodos/ atributos são visiveis apenas na classe
// Protected => bem parecido com o private
public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "Daniel", "victor",
                LocalDate.of(2001, 7, 30), 1.93, 120.0);

         System.out.println(cliente1.getNome());
         System.out.println(cliente1.getSobrenome());
         System.out.println(cliente1.getNomeCompleto());

    }
}
