
package Dados;

public class Prontuario {
   
    String nomePaciente;
    int numeroProntuario;
    String descricao;

    public Prontuario() {
    }

    public Prontuario(String nomePaciente, int numeroProntuario, String descricao) {
        this.nomePaciente = nomePaciente;
        this.numeroProntuario = numeroProntuario;
        this.descricao = descricao;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public int getNumeroProntuario() {
        return numeroProntuario;
    }

    public void setNumeroProntuario(int numeroProntuario) {
        this.numeroProntuario = numeroProntuario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
    
    
}
