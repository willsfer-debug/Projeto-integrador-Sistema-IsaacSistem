
package Dados;

import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta {

    String nomePaciente;
    String cpfPaciente;
    String nomeMae;
    LocalDate dataConsulta;
    LocalTime horario;

    public Consulta() {
    }

    public Consulta(String nomePaciente, String cpfPaciente, String nomeMae, LocalDate dataConsulta, LocalTime horario) {
        this.nomePaciente = nomePaciente;
        this.cpfPaciente = cpfPaciente;
        this.nomeMae = nomeMae;
        this.dataConsulta = dataConsulta;
        this.horario = horario;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }
    
    public void marcarConsulta() {

        System.out.println("========== CONSULTA MARCADA PARA: ==========");
        System.out.println("Nome do paciente:" + nomePaciente);
        System.out.println("CPF do paciente:" + cpfPaciente);
        System.out.println("Nome da mae:" + nomeMae);
        System.out.println("Data da consulta:" + dataConsulta);
        System.out.println("Hora da consulta:" + horario);
    
    }
    
    
    
    
}
