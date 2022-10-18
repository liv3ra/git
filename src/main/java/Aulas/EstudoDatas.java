package Aulas;

import java.time.LocalDate;

public class EstudoDatas {
    public static void main(String[] args) {
     //dia - mês - ano
        //LocalDate armazena qualquer data (dia, mês, ano)
     LocalDate hoje = LocalDate.now(); // pega a data atual
     System.out.println(hoje);

     LocalDate natal = LocalDate.of( 2022, 12, 25);
     System.out.println(natal);

     System.out.println(hoje.isAfter(natal)); // verifica se a data e depois da especifica
     System.out.println(hoje.isBefore(natal)); // verifica se a data e antes da especifica
     int ano = hoje.getYear(); // ano da data
     int mes = hoje.getMonthValue(); // numero do mês
     int dia = hoje.getDayOfMonth(); // numero do dia do mês

     int diasParaNatal = natal.getDayOfYear() - hoje.getDayOfYear();

     System.out.println(ano);
     System.out.println(mes);
     System.out.println(dia);


     System.out.println("Faltam " + diasParaNatal + " dias p/ natal !!!!");

    }
}
