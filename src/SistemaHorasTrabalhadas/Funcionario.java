package SistemaHorasTrabalhadas;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;


public class Funcionario {
    private int codigoFuncionario;
    private String nome;
    private LocalDate dataContratacao;
    private Double salarioHora;
    RegistroPonto[] registroPontos = new RegistroPonto[5];

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public Double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(Double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public Funcionario(int codigoFuncionario, String nome, LocalDate dataContratacao, Double salarioHora) {
        this.codigoFuncionario = codigoFuncionario;
        this.nome = nome;
        this.dataContratacao = dataContratacao;
        this.salarioHora = salarioHora;

        for (int i = 0; i < registroPontos.length; i++) {
            registroPontos[i] = new RegistroPonto();
        }
    }

    public void registraEntradaFuncionario(int dia, LocalTime horaEntrada) {
        registroPontos[dia - 1].setEntrada(horaEntrada);
        registroPontos[dia - 1].setDia(dia);
    }

    public void registraSaidaFuncionario(int dia, LocalTime horaSaida) {
        registroPontos[dia - 1].setSaida(horaSaida);
        registroPontos[dia - 1].setDia(dia);
    }

    public Duration verificaNumeroHorasTrabalhasPorDia(int dia) {
        return Duration.between(registroPontos[dia - 1].getEntrada(), registroPontos[dia - 1].getSaida());
    }

    /*
calculaSalario()
verificaNumeroHorasTrabalhadasPorDia
calcularNumeroDeHorasTrabalhadasPorSemana
calculaSalarioBrutoSemanal()

     */
}
