
package Dados;

public class medico {
    
    String nome;
    String CRM;
    String especialidade;

    public medico() {
    }

    public medico(String nome, String CRM, String especialidade) {
        this.nome = nome;
        this.CRM = CRM;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    
    public void mostrarNome (){
        System.out.println("============ DADOS DO MÉDICO =============");
        System.out.println("Nome do médico: " + nome);
        System.out.println("CRM do médico: " + CRM);
        System.out.println("Especialidade: " + especialidade);
        
        
    }
    
    
}
