
package exerherenca;

public class ExerHerenca {

    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        
        //PESSOA
        p1.setNome("Pedro");
        
        //DADOS ALUNO
        p2.setNome("Maria");
        p2.setEndereco("Avenida Ipiranga, n 100");
        p2.setCurso("Medicina");
        p2.setNota1(7);
        p2.setNota2(8);
        p2.setNota3(9);
        p2.tirarCopia();
        p2.calcularMedia();
        p2.VerificarAprovado();
        
        //PROFESSOR
        p3.setNome("Claudio");
        p3.setCurso("Engenharia");
        p3.setSalario(3000);
        p3.tirarCopia();
        p3.calcularSalarioLiquido();
        
        
        
    
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        
    }
    
}
