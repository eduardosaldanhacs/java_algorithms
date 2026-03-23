package SistemaHorasTrabalhadas;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;

public class App {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Funcionario f1 = new Funcionario(12345, "Eduardo Saldanha", LocalDate.of(2023, 2, 22), 50.0);
        f1.registraEntradaFuncionario(1, LocalTime.of(8,30));
        f1.registraSaidaFuncionario(1, LocalTime.of(18,0));
        Duration duracao = f1.verificaNumeroHorasTrabalhasPorDia(1);
        System.out.println("O tempo de horas trabalhadas foi: " + duracao.toHours());
    }
}
