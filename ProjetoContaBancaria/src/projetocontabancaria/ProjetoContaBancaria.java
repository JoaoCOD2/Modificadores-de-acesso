
package projetocontabancaria;


public class ProjetoContaBancaria {

    
    public static void main(String[] args) {
         ContaBancaria conta = new ContaBancaria();
        
        conta.titular = "Pedro";

        conta.depositar(500);
        conta.sacar(200);

        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo atual: " + "R$"+ conta.getSaldo());
    }
    
}
  
