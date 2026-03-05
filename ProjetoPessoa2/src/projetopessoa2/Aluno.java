
package projetopessoa2;


public class Aluno extends Pessoa {
    public void definirIdade(int idade){
        this.idade = idade;
    }
    
    public void exibiridade(){
            System.out.println("Idade do aluno: " + idade);
    }
    
}
