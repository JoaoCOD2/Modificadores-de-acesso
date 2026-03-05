
package criandoclassecomprivateemetodos;


public class CriandoClasseComPrivateeMetodos {

    
    public static void main(String[] args) {
        Produto p1 = new Produto ();
        p1.setPreco(39.99);
        p1.setNome("Café");
                
        System.out.println(p1.getNome() + " " + "R$" + p1.getPreco());
        
        
        Produto p2 = new Produto ();
        p2.setNome("Caixa de leite");
        p2.setPreco(61.99);
        
        System.out.println(p2.getNome() + " " + "R$" + p2.getPreco());
        
        Produto p3 = new Produto ();
        p3.setNome("Açucar 1KG");
        p3.setPreco(4.59);
        
        System.out.println(p3.getNome() + " " + "R$" + p3.getPreco());   
    }
    
}
