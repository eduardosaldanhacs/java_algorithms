package ExerciciosGeradosPorIA.Ex005;

/*
    > Exercício 2: Classe Aluno com Encapsulamento e Construtores

    Crie uma classe Aluno com as propriedades privadas nome, matricula, notaFinal.
    Adicione um construtor parametrizado para inicializar essas propriedades e
    implemente os setters e getters com validação para garantir
    que o nome não esteja vazio e a nota final esteja entre 0 e 100.
    Na classe principal, crie dois objetos da classe Aluno,
    atribua valores e exiba as informações.

 */

public class Aluno {
    private String nome;
    private int matricula;
    private Double notaFinal;

    public Aluno (String nome, int matricula, Double notaFinal) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaFinal = notaFinal;
    }

    public void setNome(String nome) {
        if(!nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Digite um nome válido.");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setNotaFinal(Double notaFinal) {
        if(notaFinal >= 0 && notaFinal <= 100) {
            this.notaFinal = notaFinal;
        } else {
            System.out.println("Digite uma nota válida.");
        }
    }

    public Double getNotaFinal() {
        return notaFinal;
    }

    public void exibirInformacoes(Aluno aluno) {
        System.out.println("===== INFORMAÇÕES =====");
        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Matrícula do aluno: " + aluno.getMatricula());
        System.out.println("Nota final: " + aluno.getNotaFinal());
    }

    public static void main(String[] args) {
        System.out.println("Construindo objetos: ");
        Aluno aluno1 = new Aluno("Eduardo", 25204090, 7.50);
        aluno1.exibirInformacoes(aluno1);
        Aluno aluno2 = new Aluno("Marcos", 26105101, 9.50);
    }
}
