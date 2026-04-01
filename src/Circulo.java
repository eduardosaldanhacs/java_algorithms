/*

1) Modele e implemente em Java a abstração do elemento geométrico círculo. Não utilize a
classe de desenho de círculo presente na API de classes da linguagem. Deseja-se que o círculo
possua informações de posicionamento no plano cartesiano (coordenadas não-negativas no
eixo X e Y) dados por um ponto central, além do raio associado. Deve ser possível calcular a área
do círculo, o comprimento da circunferência e mudar a posição do círculo.

 */

public class Circulo {
    private int eixoX;
    private int eixoY;
    private Double raio;

    public Circulo() {

    }

    public Circulo(int eixoX, int eixoY) {
        this.eixoX = eixoX;
        this.eixoY = eixoY;
    }

    public void setEixoX(int eixoX) {
        this.eixoX = eixoX;
    }

    public int getEixoX() {
        return this.eixoX;
    }

    public void setEixoY(int eixoY) {
        this.eixoY = eixoY;
    }

    public int getEixoY() {
        return this.eixoY;
    }

    //public

}
