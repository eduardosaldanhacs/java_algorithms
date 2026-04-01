package Lustre;

public class Lampada {
    //ligada, queimada, desligada
    // 30% chance de queimar

    public enum STATUS_LAMPADA {LIGADA, QUEIMADA, DESLIGADA};
    private final Double CHANCE_QUEIMAR =  0.3;
    private STATUS_LAMPADA status;

    public void ligar() {
        if(this.status == STATUS_LAMPADA.LIGADA) {
            System.out.println("Lampada já está ligado! ");
            return;
        }

        if(this.status == STATUS_LAMPADA.QUEIMADA) {
            System.out.println("Lampada está queimado! ");
            return;
        }

        if(Math.random() < CHANCE_QUEIMAR) {
            System.out.println("Lampada está queimada! ");
            this.status = STATUS_LAMPADA.QUEIMADA;
        } else {
            System.out.println("Lampada está ligada! ");
            this.status = STATUS_LAMPADA.LIGADA;
        }
    }

    public void desligar() {
        if(this.status == STATUS_LAMPADA.DESLIGADA) {
            System.out.println("Lampada está desligada! ");
            return;
        }
        if(this.status == STATUS_LAMPADA.QUEIMADA) {
            System.out.println("Lampada está queimada! ");
            return;
        }
        if(this.status == STATUS_LAMPADA.LIGADA) {
            System.out.println("Lampada está desligada! ");
            this.status = STATUS_LAMPADA.DESLIGADA;
        }
    }

    public STATUS_LAMPADA getStatus() {
        return this.status;
    }
}
