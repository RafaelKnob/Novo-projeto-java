
package exerherenca;
public class Professor extends Pessoa {
    public String curso;
    public float Salario;
    
    @Override
    public void tirarCopia(){
        System.out.println("Professor " + this.nome + " sua copia foi efetuada, valor R$ 00,05 centavos.");
    }
    
    public void calcularSalarioLiquido(){
        double inss = 7.5 / 100.0;
        double liquido = Salario + (inss *Salario) - 142.80;
        
        
        //float liquido = Salario - 5;
        
        System.out.println(this.nome + " Seu salario Liquido é: " + liquido);
        
        
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    
}
