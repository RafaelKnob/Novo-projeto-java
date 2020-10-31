
package exerherenca;

public class Pessoa {
    public String nome;
    public String endereco;
    public int telefone;
    public int cpf;
    
    
    public void tirarCopia(){
        System.out.println(this.nome + " sua copia foi efetuada, valor R$ 0,10 centavos." );
        
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

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", cpf=" + cpf + '}';
    }
    
    
}
