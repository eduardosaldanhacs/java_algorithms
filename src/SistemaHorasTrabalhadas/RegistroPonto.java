package SistemaHorasTrabalhadas;
import java.time.LocalTime;
import java.time.Duration;

public class RegistroPonto {
    private LocalTime entrada;
    private LocalTime saida;
    int dia;

    public void setEntrada(LocalTime entrada) {
        this.entrada = entrada;
    }

    public LocalTime getEntrada() {
        return this.entrada;
    }

    public void setSaida(LocalTime saida) {
        this.saida = saida;
    }

    public LocalTime getSaida() {
        return this.saida;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return this.dia;
    }



}

