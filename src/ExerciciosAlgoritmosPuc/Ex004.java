package ExerciciosAlgoritmosPuc;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        //4. Faça um algoritmo que leia a idade de uma pessoa expressa em dias
        // e mostre-a expressa em anos, meses e dias.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade em dias: ");
        int idade = scanner.nextInt();
        int idadeEmAnos = ((idade / 30) / 12);
        System.out.println("Sua idade em anos é: " + idadeEmAnos);
    }
}
