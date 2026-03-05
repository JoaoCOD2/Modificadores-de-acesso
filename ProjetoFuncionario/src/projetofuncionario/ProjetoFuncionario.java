 
package projetofuncionario;


public class ProjetoFuncionario {

    
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        
        f1.setNome("João");
        f1.setSalario(8.598);
        
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Salario: " + f1.getSalario());
        
    }
    
}
