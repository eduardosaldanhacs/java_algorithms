package ExerciciosAlgoritmosPuc;

import java.util.Scanner;

/*
6. Faça um algoritmo que leia o tempo de duração de um evento
em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */
public class Ex006 {
    public static void main(String[] args) {
        System.out.println("Digite o tempo de duração do evento em segundos: ");
        Scanner scanner = new Scanner(System.in);
        double duracaoEmSegundos = scanner.nextDouble();
        double segundoParaMinutos = duracaoEmSegundos / 60.0;
        double minutosParaHoras = segundoParaMinutos / 60.0;
        System.out.printf("A duração do evento é: " +
                "\n Em minutos: " + segundoParaMinutos +
                "\n Em horas: " + minutosParaHoras +
                "\n Em segundos: " + duracaoEmSegundos);

    }
}
