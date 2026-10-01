
package Dados;

public class Paciente {
    
    int prontuario;
    String nome;
    String alergias;
    int idade;

    public Paciente() {
    }

    public Paciente(int prontuario, String nome, String alergias, int idade) {
        this.prontuario = prontuario;
        this.nome = nome;
        this.alergias = alergias;
        this.idade = idade;
    }

    public int getProntuario() {
        return prontuario;
    }

    public void setProntuario(int prontuario) {
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    
    
    

    
}
