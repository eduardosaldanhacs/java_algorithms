package SimuladorLoteria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SimuladorLoteria {
    public static void main(String[] args) {
    /*
       > 5 - Criar a Classe SimuladorLoteria:

        No método main, use a classe Scanner para permitir que o jogador insira 6 números.
        Armazene esses números em um array e crie um novo objeto Bilhete com esses números.
        Repita esse processo para permitir o registro de vários bilhetes.

     */
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bilhete> bilhetes = new ArrayList<>();

        int[] numerosEscolhidos = new int[6];
        boolean continuar;
        String opcao;
        do {
            for (int i = 0; i < 6; i++) {
                System.out.println("Escolha um número para o bilhete: ");
                int numeroEscolhido = scanner.nextInt();
                numerosEscolhidos[i] = numeroEscolhido;
                System.out.println(Arrays.toString(numerosEscolhidos));
            }
            Bilhete bilhete = new Bilhete(numerosEscolhidos);
            Arrays.fill(numerosEscolhidos, 0); //todos os valores ficam zerados;

            bilhetes.add(bilhete);

            System.out.println("Deseja fazer outro bilhete? S - N");
            opcao = scanner.next();
            if(opcao.equals("S")) {
                continuar = true;
            } else if(opcao.equals("N")) {
                continuar = false;
            } else {
                System.out.println("Digite uma opção válida! ");
                continuar = false;
            }

        } while(continuar);
        /*
         > 6 - Realizar o Sorteio:
            Após registrar os bilhetes, para cada bilhete, chame o método realizarSorteio.
            Exiba os resultados de cada bilhete chamando o método exibirResultado.
         */
        for(Bilhete bilhete: bilhetes) {
            bilhete.realizarSorteio();
            bilhete.exibirResultado();
        }
        scanner.close();
    }
}