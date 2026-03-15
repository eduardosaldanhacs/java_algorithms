package ExerciciosAlgoritmosPuc;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        //3. Faça um algoritmo que leia a idade de uma pessoa expressa em anos,
        // meses e dias e mostre-a expressa apenas em dias.
        int anoParaDias, mesesParaDias, anosEmDias;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade no seguinte formato: (ano mes dia)");
        System.out.println("Exemplo: 21 6 3");
        int anos = scanner.nextInt();
        int meses = scanner.nextInt();
        int dias = scanner.nextInt();

        anoParaDias = ((anos * 12) * 30);
        mesesParaDias = (meses * 30);
        anosEmDias = anoParaDias + mesesParaDias + dias;
        System.out.println("Sua idade em dias é: " + anosEmDias);
    }
}
