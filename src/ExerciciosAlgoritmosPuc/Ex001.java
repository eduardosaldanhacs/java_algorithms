package ExerciciosAlgoritmosPuc;

import java.util.Scanner;

/*
1. Construa um algoritmo que, tendo como dados de entrada dois pontos quaisquer no plano,
P(x1,y1) e P(x2,y2), escreva a distância entre eles.
A fórmula que efetua tal cálculo é  d = sqrt (x2 - x1)² + (y2 - y1)²
 */
public class Ex001 {
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        double d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor x1 em P(x1,y1): ");
        x1 = scanner.nextInt();
        System.out.println("Digite o valor y1 em P(x1,y1): ");
        y1 = scanner.nextInt();
        System.out.println("Digite o valor x2 em P(x2,y2): ");
        x2 = scanner.nextInt();
        System.out.println("Digite o valor y2 em P(x2,y2): ");
        y2 = scanner.nextInt();
        d = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );
        System.out.println("A distância entre os pontos são: " + d);
        //formula
        // d = sqrt (x2 - x1)² + (y2 - y1)²
        //Math.pow(base, expoente)
    }
}