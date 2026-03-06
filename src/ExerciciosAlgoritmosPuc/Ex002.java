package ExerciciosAlgoritmosPuc;

import java.util.Scanner;

/*2. Escreva um algoritmo que leia três números inteiros e positivos (A, B, C) e
 calcule a seguinte expressão:
D = R + S / 2   || R = (A + B)²  || S = (B + C)²
*/
public class Ex002 {
    public static void main(String[] args) {
        int A, B, C;
        double R, S, D;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        A = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        B = sc.nextInt();
        System.out.println("Digite o valor de C: ");
        C = sc.nextInt();

        //calculos
        R = Math.pow(A + B, 2);
        S = Math.pow(B + C, 2);
        D = (R + S) / 2;
        System.out.println("O valor de D é: " + D);
    }
}
