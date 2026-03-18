package SimuladorLoteria;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 > 1 - Criar a Classe Bilhete:
Defina os atributos privados numerosEscolhidos (array de inteiros) e resultadoSorteio (array de inteiros).
Crie um construtor que receba os números escolhidos pelo jogador e atribua ao atributo numerosEscolhidos.
*/
public class Bilhete {
    private final int[] numerosEscolhidos = new int[6];
    private final int[] resultadoSorteio = new int [6];

    public Bilhete(int[] numerosEscolhidos) {
        for(int i = 0; i < numerosEscolhidos.length; i++) {
            this.numerosEscolhidos[i] = numerosEscolhidos[i];
        }
    }
    /*
      > 2 - Método realizarSorteio:
            Dentro da classe Bilhete, crie o método realizarSorteio.
            Use a classe Random para gerar 6 números aleatórios entre 1 e 60.
            Armazene esses números no array resultadoSorteio
            e ordene os números usando Arrays.sort().
    */
    public int[] realizarSorteio() {
        Random random = new Random();
        for(int i = 0; i < 6; i++) {
            int numeroAleatorio = random.nextInt(60) + 1;
            this.resultadoSorteio[i] = numeroAleatorio;
        }
        Arrays.sort(resultadoSorteio);
        return (resultadoSorteio);
    }

    /*
       > 3 - Método contarAcertos:
            Crie o método contarAcertos dentro da classe Bilhete.
            Compare os números escolhidos pelo jogador com os números sorteados
            e conte quantos números coincidem.
            Retorne o número de acertos.
     */

    public int contarAcertos(int []numerosEscolhidos, int[]resultadoSorteio) {
        int numeroAcertos = 0;
        for(int i = 0; i < numerosEscolhidos.length; i++) {
            if(numerosEscolhidos[i] == resultadoSorteio[i]) {
                numeroAcertos++;
            }
        }
        return numeroAcertos;
    }

    /*
        > 4 - Método exibirResultado:
            Crie o método exibirResultado dentro da classe Bilhete.
            Use Arrays.toString() para exibir os números escolhidos e os números sorteados.
            Chame o método contarAcertos e exiba quantos números foram acertados.
     */
    public void exibirResultado() {
        System.out.println("Números escolhidos: " + Arrays.toString(this.numerosEscolhidos));

        int[] numerosSorteados = new int[6];
        numerosSorteados = this.realizarSorteio();

        System.out.println("Números sorteados: " + Arrays.toString(numerosSorteados));
        System.out.println("Número de acertos: " + contarAcertos(numerosEscolhidos, numerosSorteados));
    }
}

/*
        > 7 - Fechar o Scanner:

Ao final do programa, lembre-se de fechar o Scanner para evitar vazamento de recursos.
*/


