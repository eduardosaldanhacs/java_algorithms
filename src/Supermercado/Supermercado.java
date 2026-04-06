package Supermercado;

public class Supermercado {
    public Caixa[] caixas;
    public int nroClientesEntraram = 0;
    public int clientesNaoAtendidos = 0;

    public Caixa[] getCaixas() {
        return caixas;
    }

    public void setCaixas(Caixa[] caixas) {
        this.caixas = caixas;
    }

    public int getNroClientesEntraram() {
        return nroClientesEntraram;
    }

    public void setNroClientesEntraram(int nroClientesEntraram) {
        this.nroClientesEntraram = nroClientesEntraram;
    }

    public int getClientesNaoAtendidos() {
        return clientesNaoAtendidos;
    }

    public void setClientesNaoAtendidos(int clientesNaoAtendidos) {
        this.clientesNaoAtendidos = clientesNaoAtendidos;
    }

    public void entraCliente() {
        this.nroClientesEntraram++;
        int menorFila = Integer.MAX_VALUE;
        int identidade = 0;
        for(Caixa cx : caixas) {
            if(!cx.Cheio()) { //procurar caixa com a menor fila
                int tamanhoFilaAtual = cx.getTamFilaAtual();
                if(tamanhoFilaAtual < menorFila) {
                    menorFila = tamanhoFilaAtual;
                    identidade = cx.getIdentificacao();
                }
            } else { //caixa cheio vira cliente nao atendido
                this.clientesNaoAtendidos++;
                cx.setFaturamento(cx.geraNumeroAleatorio());
            }
        }
        Caixa caixaMenorFila;
        caixaMenorFila = buscaCaixaId(identidade);
        if (caixaMenorFila != null) {
            int novaFila = caixaMenorFila.getTamFilaAtual() + 1;
            caixaMenorFila.setTamFilaAtual(novaFila);
        }
    }


    public Caixa buscaCaixaId(int identidade) {
        for (Caixa cx : caixas) {
            if (cx.getIdentificacao() == identidade) {
                return cx;
            }
        }
        return null;
    }
    public void avanca() {
        for (Caixa cx : caixas) {
            cx.realizaAtendimento();
        }
    }

    public void listaCaixas() {
        for (Caixa cx : caixas) {

        }
    }

}

