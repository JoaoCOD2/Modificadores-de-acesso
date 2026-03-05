
package projetocontabancaria;


public class ContaBancaria {

     public String titular;
    private double saldo;

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
        } else {
            System.out.println("Deposito Indísponivel");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
        } else {
            System.out.println("Saque indísponivel");
        }
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }
   }

