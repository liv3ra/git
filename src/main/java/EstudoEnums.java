// Enums são estruturas com constantes definidas
// Dias da semana, Meses do ano, Turnos do dia, estaçoes
// Niveirs, (Junior, pleno, senior), Feriados nacionais, Naipes


public class EstudoEnums {
    public static void main(String[] args) {
      enum DiaDaSemana {
          SEGUNDA,
          TERCA,
          QUARTA,
          QUINTA,
          SEXTA,
          SABADO,
          DOMINGO
      }

      DiaDaSemana hoje = DiaDaSemana.QUINTA;
        System.out.println(hoje);

        enum NivelDev { JUNIOR, PLENO, SENIOR }
        NivelDev nivel = NivelDev.PLENO;

        switch (nivel) {
            case JUNIOR:
                System.out.println("Seu nivel e JUNIOR");
                break;
            case PLENO:
                System.out.println("Seu nivel e PLENO");
                break;
            case SENIOR:
                System.out.println("Seu nivel e SENIOR");
                break;
        }

        // VERSÃO ENHANCED
        switch(nivel) {
            case JUNIOR -> {
                System.out.println("Seu nível é JUNIOR");
            }
            case PLENO -> {
                System.out.println("Seu nível é PLENO");
            }
            case SENIOR -> {
                System.out.println("Seu nível é SENIOR");
            }
            default -> {
                System.out.println("Nunca executa");
            }
        }

    }
}
