package Supermercado;

import java.util.Random;

public class Caixa {
    public int identificacao;
    public int tamFilaAtual;
    public int faturamento = 0;
    Operacional status;
    
    public static int nroMaximoNaFila;
    public static int classId;

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public int getTamFilaAtual() {
        return tamFilaAtual;
    }

    public void setTamFilaAtual(int tamFilaAtual) {
        this.tamFilaAtual = tamFilaAtual;
    }

    public int getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(int faturamento) {
        this.faturamento = faturamento;
    }

    public Operacional getStatus() {
        return status;
    }

    public void setStatus(Operacional status) {
        this.status = status;
    }

    public static int getNroMaximoNaFila() {
        return nroMaximoNaFila;
    }

    public static void setNroMaximoNaFila(int nroMaximoNaFila) {
        Caixa.nroMaximoNaFila = nroMaximoNaFila;
    }

    public static int getClassId() {
        return classId;
    }

    public static void setClassId(int classId) {
        Caixa.classId = classId;
    }
    
    public boolean incFila() {
        int tamanhoFilaAtual = getTamFilaAtual();
        if(getTamFilaAtual() + 1 < getNroMaximoNaFila()) {
            setTamFilaAtual(tamanhoFilaAtual);
            return true;
        }
        return false;
    }

    public boolean Cheio() {
        if(getTamFilaAtual() == getNroMaximoNaFila()) {
            return true;
        } return false;
    }

    public int geraNumeroAleatorio() {
            Random random = new Random();
            int numero = random.nextInt(200) + 1; // gera de 1 a 200
            return numero;
    }

    public void realizaAtendimento() {
        if(getTamFilaAtual() > 0) {
            setTamFilaAtual(getTamFilaAtual() - 1);
            int faturamentoAtual = getFaturamento();
            faturamentoAtual += geraNumeroAleatorio();
            setFaturamento(faturamentoAtual);
        }
    }
}
