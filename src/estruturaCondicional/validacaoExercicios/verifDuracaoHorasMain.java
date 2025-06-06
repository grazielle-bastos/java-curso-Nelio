package estruturaCondicional.validacaoExercicios;

import java.util.Scanner;
import java.util.TimeZone;

public class verifDuracaoHorasMain {
    public static void main(String[] args) {

    //Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora inicial do jogo: ");
        int horaInicial = sc.nextInt();

        System.out.println("Digite a hora final do jogo: ");
        int horaFinal = sc.nextInt();

        sc.close();

        int duracao;

        if(horaInicial < horaFinal) /*Começa e termina no mesmo dia*/{
            duracao = horaFinal - horaInicial;
        } else if (horaInicial > horaFinal) /*Começa num dia e termina no outro*/ {
            duracao = (24 - horaInicial) + horaFinal;
        } else /*Começa e termina na mesma hora*/{
            duracao = 24;
        }

        System.out.println("O jogo durou " + duracao + " hora(s)");
    }

}
