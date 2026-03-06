package ExerciciosAlgoritmosPuc;

import java.util.Scanner;

/*
5. Faça um algoritmo que leia as 3 notas de um aluno e calcule a média final deste aluno.
Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
 */
public class Ex005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3, media;
        System.out.println("Digite suas 3 notas: ");
        System.out.println("Primeira nota: ");
        nota1 = scanner.nextDouble();
        System.out.println("Segunda nota: ");
        nota2 = scanner.nextDouble();
        System.out.println("Terceira nota: ");
        nota3 = scanner.nextDouble();
        media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
        System.out.println("Sua média final é: " + media);
    }
}
