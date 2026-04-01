package Senha;

/*
Exercício 2. Crie uma classe senha que contenha um atributo de classe chamado senhaAtual e
um atributo de instância chamado minhaSenha, ambos do tipo inteiro e ambos privados. Crie
ainda um método get para cada um destes atributos. No construtor da classe senha, faça com
que senhaAtual seja atribuído a minhaSenha e que em seguida incrementa o atributo de classe.
Finalmente, crie uma classe Principal, onde deverá ser definido um vetor de objetos do tipo
senha, de tamanho informado pelo usuário. De forma aleatória, instancie cada um dos objetos
do vetor. Ao final, imprima o valor contido no atributo minhaSenha de cada objeto.
 */

public class Senha {
    private static int senhaAtual = 1;
    private int minhaSenha;

    public Senha() {
        this.minhaSenha = senhaAtual;
        senhaAtual++;
    }


    public int getMinhaSenha() {
        return this.minhaSenha;
    }

    public static int getSenhaAtual() {
        return senhaAtual;
    }

}
