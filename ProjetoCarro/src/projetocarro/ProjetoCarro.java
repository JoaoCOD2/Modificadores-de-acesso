
package projetocarro;


public class ProjetoCarro {

    
    public static void main(String[] args) {
        Carro c1 = new Carro ();
        
        c1.setMarca("Fusion");
        c1.setModelo("Ford");
        c1.setAno(2015);
        
        System.out.println("Marca: " + c1.getMarca());
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Ano: " + c1.getAno());
                
        
    }
    
}
