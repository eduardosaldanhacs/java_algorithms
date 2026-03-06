package teste;

import java.util.ArrayList;
import java.util.Scanner;

/*
==============================
COLA BÁSICA JAVA
==============================
*/
public class Anotacoes {
    public static void main(String[] args) {
        /*
        ==============================
        DECLARAÇÃO DE VARIÁVEIS
        ==============================
        */

        int numero = 10;
        double preco = 5.99;
        String nome = "Eduardo";
        boolean ativo = true;

        /*
        ==============================
        ENTRADA DE DADOS
        ==============================
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int valor = scanner.nextInt();

        System.out.print("Digite um nome: ");
        String texto = scanner.next();

        /*
        ==============================
        IF / ELSE
        ==============================
        */

        if (valor > 10) {
            System.out.println("Maior que 10");
        } else if (valor == 10) {
            System.out.println("Igual a 10");
        } else {
            System.out.println("Menor que 10");
        }

        /*
        ==============================
        FOR
        ==============================
        */

        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " + i);
        }

        /*
        ==============================
        WHILE
        ==============================
        */

        int contador = 0;

        while (contador < 5) {
            System.out.println(contador);
            contador++;
        }

        /*
        ==============================
        DO WHILE
        ==============================
        */

        int x = 0;

        do {
            System.out.println(x);
            x++;
        } while (x < 5);

        /*
        ==============================
        SWITCH
        ==============================
        */

        int opcao = 2;

        switch (opcao) {
            case 1:
                System.out.println("Opção 1");
                break;

            case 2:
                System.out.println("Opção 2");
                break;

            default:
                System.out.println("Outra opção");
        }

        /*
        ==============================
        ARRAY
        ==============================
        */

        int[] numeros = {10, 20, 30, 40};

        System.out.println(numeros[0]); // primeiro elemento

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        /*
        ==============================
        FOREACH
        ==============================
        */

        for (int n : numeros) {
            System.out.println(n);
        }

        /*
        ==============================
        LISTA (ARRAYLIST)
        ==============================
        */

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Maçã");
        lista.add("Banana");
        lista.add("Uva");

        System.out.println(lista.get(0));

        for (String fruta : lista) {
            System.out.println(fruta);
        }

        /*
        ==============================
        TAMANHO
        ==============================
        */

        System.out.println(numeros.length); // array
        System.out.println(lista.size());   // lista

        /*
        ==============================
        CONVERTER TIPOS
        ==============================
        */

        String numeroTexto = "10";
        int numeroConvertido = Integer.parseInt(numeroTexto);

        int numero2 = 20;
        String textoNumero = String.valueOf(numero2);

        /*
        ==============================
        ARGUMENTOS DO MAIN
        ==============================
        */

        if (args.length > 0) {
            System.out.println("Primeiro argumento: " + args[0]);
        }

    }
}




