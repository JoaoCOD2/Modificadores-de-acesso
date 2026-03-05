
package projetoporta;


public class Porta {
    private boolean aberta;
    
    public void abrir(){
        aberta = true;
        System.out.println("A porta foi aberta.");
    }
    
    public void fechar(){
        aberta = false;
        System.out.println("A porta foi fechada.");
    }
    
    public void status (){
        if (aberta){
            System.out.println("A porta está aberta");
        }else {
            System.out.println("A porta está fechada.");
        }
    }
}
