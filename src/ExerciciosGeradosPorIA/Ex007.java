package ExerciciosGeradosPorIA;

/*
    > Exercício 2: Encontrar o Elemento Mais Frequente em um Array

    Desenvolva um programa que receba um array de inteiros
    e determine qual elemento aparece com maior frequência.
    Caso haja empate, exiba todos os elementos empatados.

  > Exercício 3: Transpor uma Matriz 2D

    Crie um programa que receba uma matriz 2D
    e crie a matriz transposta (troca de linhas por colunas).
    Exiba a matriz original e a matriz transposta.

    > Exercício 4: Substituir Valores em um Array com Condição

    Escreva um programa que receba um array de inteiros
    e substitua todos os valores negativos por zero.
    Exiba o array antes e depois da modificação.


    // [ -1, 2 , 3]
    // [0, 2, 3]

    > Exercício 5: Remover Elementos Duplicados de um Array

    Desenvolva um programa que remova os elementos duplicados de um array de inteiros,
    mantendo apenas a primeira ocorrência de cada valor.
    Exiba o array original e o array sem duplicatas.

    [1, 1, 2, 2, 3]
    [1, 2, 3]
 */


public class Ex007 {
    public static void main(String[] args) {
        int[] inteiros = {1, 2, 2, 3, 3, 4, 4, 4};
        int maiorContador = 0;
        int maiorValor = 0;
        int contadorMaiorValor = 0;
        int[] maioresValores = new int[10];
        for (int i = 0; i <= inteiros.length; i++) {
            int valorAtual = inteiros[i];
            int contador = 0;
            for(int j = 0; j <= inteiros.length; j++) {
                if(valorAtual == inteiros[j]) {
                    contador++;
                }
            }
            if(maiorContador == 0) {
                maiorContador = contador;
                maiorValor = valorAtual;
            } else if(maiorContador == contador) {
                maioresValores[contadorMaiorValor] = maiorValor;
            } else {
                maiores
            }
        }
    }
}
