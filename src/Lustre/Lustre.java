package Lustre;
import java.util.ArrayList;

public class Lustre {
    //usuario define a quantidade de lampadas
    Lampada[]lampadas = new Lampada[10];
    int qtdLampadas;
    //metodo que verdadeiro caso tenha alguma lampada queimada e falso caso contrário
    public boolean verificaLampadasQueimadas(Lampada lampada) {
        return lampada.getStatus() == Lampada.STATUS_LAMPADA.QUEIMADA;
    }

    //metodo que retorna uma coleção com a posição de lampadas queimadas
    public int[]verificaQtdLampadasQueimadas(Lampada []lampadas) {
        int[] posicoesLampadasQueimadas = new int[qtdLampadas];
        int posicoesQueimadas = 0;
        for(int i = 0; i < lampadas.length; i++) {
            if(lampadas[i].getStatus() == Lampada.STATUS_LAMPADA.QUEIMADA) {
                posicoesLampadasQueimadas[posicoesQueimadas] = i;
                i++;
            }
        }
        return posicoesLampadasQueimadas;
    }

    //uma aplicacao que liga e desliga várias vezes o lustre e mostre a posicao das lampadas queimadas no processo
    public void ligarLustre(int qtdLampadas) {
        for(int i = 0; i < qtdLampadas; i++) {
            Lampada lampada = new Lampada();
            lampada.ligar();
            lampadas[i] = lampada;
        }
    }

    public Lampada[] getLustre() {
        return this.lampadas;
    }

}
