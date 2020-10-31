
package exerherenca;
public class Aluno extends Pessoa {
    public String curso;
    public float nota1, nota2, nota3;
    
    public void calcularMedia(){
           float m = (nota1 + nota2 + nota3) / 3;
           System.out.println(this.nome + " Sua media é: " + m);
    }
    
    public void VerificarAprovado(){
        float m = (nota1 + nota2 + nota3) / 3;
        if (m >= 7) {
            System.out.println(this.nome + " Você esta aprovado(a).");
        }else{
            System.out.println(this.nome + " Você esta em recuperação.");
        }
      
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
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
        return "Aluno{" + "curso=" + curso + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + '}';
    }
    
}
