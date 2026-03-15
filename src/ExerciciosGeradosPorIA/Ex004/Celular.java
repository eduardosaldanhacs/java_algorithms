package ExerciciosGeradosPorIA.Ex004;

public class Celular {
/*
    > Exercício 1: Criando uma Classe Celular

    Crie uma classe Celular que tenha as seguintes propriedades: marca, modelo, bateria.
    Implemente os métodos para ligar e desligar o celular,
    e outro método que simule o consumo da bateria quando o celular é usado.
    Crie a classe principal para instanciar dois objetos Celular
    e testar os métodos criados.
 */
    private String marca;
    private String modelo;
    private int bateria = 100;

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getBateria() {
        return this.bateria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    private void ligarCelular(int bateria) {
        System.out.println("Celular ligado.");
        this.setBateria(bateria - 1);
    }

    public static void desligarCelular() {
        System.out.println("Celular desligado.");
    }

}
