package Cofrinho;

/*
    Escreva um programa Java que cria um cofrinho e insere 10 moedas no mesmo. Em
    seguida o programa deve imprimir:
    a. Quantas moedas foram armazenadas no cofrinho.
    b. Quantas moedas de um real estão armazenadas no cofrinho.
    c. Quantas moedas de 50 centavos estão armazenadas no cofrinho.
    d. Qual o valor total em centavos armazenado no cofrinho.
    e. Qual o valor total em reais armazenado no cofrinho.
    f. Qual o valor total em centavos armazenado no cofrinho após a retirada das
    duas últimas moedas inseridas.
*/
public class App {
    public static void main(String[] args) {
        Cofrinho porquinho = new Cofrinho(10);
        System.out.println("Quantidade de moedas armazenadas: " + porquinho.getLimite());
        System.out.println("Quantidade de moedas de um real: " + porquinho.getTotalMoedasDeReais());
        System.out.println("Quantidade de moedas de 50 centavos: " + porquinho.getTotalMoedasDeCinquentaCentavos());
        System.out.println("Valor total em centavos no cofrinho: " + porquinho.getValorTotalCentavos());
        System.out.println("Valor total em reais no cofrinho: " + porquinho.getValorTotalReais());
        System.out.println("Valor total em centavos armazenado após a retiradas das duas ultimas moedas inseridas: ");
    }

}
