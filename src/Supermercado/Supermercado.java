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

        for(Caixa cx : caixas) {
            if(!cx.Cheio()) {
                int tamanhoFilaAtual = cx.getTamFilaAtual() + 1;
                cx.setTamFilaAtual(tamanhoFilaAtual);
            } else {
                this.clientesNaoAtendidos++;
                cx.setFaturamento(cx.geraNumeroAleatorio());
            }
        }
    }

    public void avanca() {
        for(Caixa cx : caixas) {
            cx
        }
    }

}

