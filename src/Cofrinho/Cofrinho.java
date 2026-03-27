package Cofrinho;

import java.util.ArrayList;

public class Cofrinho {

    private int limite;
    ArrayList<Moeda> cofrinho = new ArrayList<>();

    public Cofrinho(int limite) {
        this.setLimite(limite);
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getLimite() {
        return this.limite;
    }


    /*
    Insere uma moeda no cofrinho. Como um “cofrinho” tem capacidade limitada, deve
    retornar true se conseguiu inserir a moeda e false caso contrário.
     */
    public boolean insere(Moeda moeda) {
        return cofrinho.add(moeda);
    }

    /*
        Retira do cofrinho a última moeda inserida (se esta operação for chamada várias vezes
        deve ir retirando todas as moedas na ordem inversa em que foram inseridas). Deve
        retornar a moeda retirada ou “null” caso o cofrinho esteja vazio
     */
    public Moeda retira() {
        int tamanhoCofrinho = this.cofrinho.size() - 1;
        if (tamanhoCofrinho > 1) {
            Moeda ultimaMoeda = this.cofrinho.get(tamanhoCofrinho);
            this.cofrinho.remove(tamanhoCofrinho);
            return ultimaMoeda;
        }
        return null;
    }

    /*
        Informa quantas moedas estão guardadas no cofrinho
     */
    public int getQtdadeMoedas() {
        return this.cofrinho.size();
    }

    /*
        Informa quantas moedas de um certo tipo estão guardadas no cofrinho
     */
    public int getQtdadeMoedasTipo(Moeda.NomeMoeda nomeMoeda) {
        int qtdMoedas = 0;
        for(Moeda moeda : cofrinho) {
            if(moeda.getNomeMoeda() == nomeMoeda) {
                qtdMoedas++;
            }
        }
        return qtdMoedas;
    }
    /*
        Informa o valor total armazenado no cofrinho (em centavos)
     */
    public int getValorTotalCentavos() {
        int TotalCentavos = 0;
        for (Moeda moeda : cofrinho) {
            TotalCentavos += moeda.getValorCentavos();
        }
        return TotalCentavos;
    }
    /*
        Informa o valor total armazenado no cofrinho (em reais)
    */
    public double getValorTotalReais() {
        double TotalReais = 0.0;
        for(Moeda moeda : cofrinho) {
            TotalReais += moeda.getValorReais();
        }
        return TotalReais;
    }

    /*
        Informa a quantidade de moedas de centavos no cofrinho
     */
    public int getTotalMoedasDeCentavos() {
        int TotalMoedasCentavos = 0;
        for(Moeda moeda : cofrinho) {
            if(moeda.getNomeMoeda() != Moeda.NomeMoeda.UmReal) {
                TotalMoedasCentavos++;
            }
        }
        return TotalMoedasCentavos;
    }

    public int getTotalMoedasDeReais() {
        int TotalMoedasReais = 0;
        for(Moeda moeda : cofrinho) {
            if(moeda.getNomeMoeda() == Moeda.NomeMoeda.UmReal) {
                TotalMoedasReais++;
            }
        }
        return TotalMoedasReais;
    }

    public int getTotalMoedasDeCinquentaCentavos() {
        int TotalMoedasCinquentaCentavos = 0;
        for(Moeda moeda : cofrinho) {
            if(moeda.getNomeMoeda() == Moeda.NomeMoeda.Cinquenta) {
                TotalMoedasCinquentaCentavos++;
            }
        }
        return TotalMoedasCinquentaCentavos;
    }



}
