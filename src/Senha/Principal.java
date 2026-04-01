package Senha;

import java.util.Random;

public class Principal {
    public Senha[] senhas;
    public int quantidade;

    public Principal(int quantidade) {
        this.quantidade = quantidade;
        this.senhas = new Senha[quantidade];
        Random rand = new Random();

        int criados = 0;
        while (criados < quantidade) {
            int pos = rand.nextInt(quantidade);

            if (senhas[pos] == null) {
                senhas[pos] = new Senha();
                criados++;
            }
        }
    }

    public void exibirDados() {
        for(int i = 0; i < this.quantidade; i++) {
            System.out.println("Senha " + i + ": " + senhas[i].getMinhaSenha());
        }
    }
}

